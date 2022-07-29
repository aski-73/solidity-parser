package net.aveyon.solidity_parser;

import net.aveyon.intermediate_solidity.SmartContractModel;
import net.aveyon.solidity_parser.parser.SolidityLexer;
import net.aveyon.solidity_parser.parser.SolidityParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Objects;

public class App implements Api {
    public static void main(String[] args) throws IOException {
        String file = "sm_purchase.plantuml";

        InputStream in;
        if (args.length > 0) {
            file = args[0];
            in = new FileInputStream(file);
        } else {
            // File files = new File(App.class.getResource("/grammar").toURI());
            // for (File f: files.listFiles())
            //     System.out.println(f.getAbsolutePath());
            in = Objects.requireNonNull(App.class.getResource("/" + file)).openStream();
        }

        // Kompilieren
        SmartContractModel listenerDone = walkParseTree(createParseTree(in));
    }

    /**
     * Public API for parsing a solidity file
     *
     * @param solidityFilePath Path to your solidity file
     * @return Intermediate Solidity representation of your solidity file
     */
    public SmartContractModel parse(String solidityFilePath) {
        File f = new File(solidityFilePath);
        if (!f.exists()) {
            return null;
        }
        try (FileInputStream fis = new FileInputStream(f)) {
            return walkParseTree(createParseTree(fis));
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * The actual parsing of the provided Solidity file
     */
    private static ParseTree createParseTree(InputStream in) throws IOException {
        CharStream input = CharStreams.fromStream(in);
        // Lexer erstellen
        SolidityLexer lexer = new SolidityLexer(input);
        // Vom Lexer gelesene Tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Parser erzeugen
        SolidityParser parser = new SolidityParser(tokens);
        // Parsen mit der Root-Grammatikregel starten. Parsetree zurückgeben
        return parser.sourceUnit();
    }

    /**
     * @param parseTree A parse tree representing a solidity file created by the solidity parser
     * @return A {@link SmartContractModel} instance representing the provided parseTree
     */
    private static SmartContractModel walkParseTree(ParseTree parseTree) {

        ParseTreeWalker walker = new ParseTreeWalker();

        MyListener listener = new MyListener();
        walker.walk(listener, parseTree);

        return listener.getSmartContractModel();
    }
}
