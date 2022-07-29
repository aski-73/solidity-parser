package net.aveyon.solidity_parser;

import net.aveyon.intermediate_solidity.*;
import net.aveyon.intermediate_solidity.impl.*;
import net.aveyon.solidity_parser.parser.SolidityParser;
import net.aveyon.solidity_parser.parser.SolidityParserBaseListener;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MyListener extends SolidityParserBaseListener {
    private SmartContractModel smartContractModel;

    private Function latestParsedFunction;

    @Override
    public void enterSourceUnit(SolidityParser.SourceUnitContext ctx) {
        String pragma = ctx.pragmaDirective().stream()
                .map(pragmaDirective -> pragmaDirective.Pragma().getText())
                .reduce("", (collection, element) -> collection + element);

        smartContractModel = new SmartContractModelImpl(
                "// SPDX-License-Identifier: GPL-3.0",
                pragma);
    }

    @Override
    public void enterInterfaceDefinition(SolidityParser.InterfaceDefinitionContext ctx) {
        Interface iface = new InterfaceImpl(ctx.identifier().getText());
        smartContractModel.getDefinitions().getInterfaces().add(iface);
        if (smartContractModel.getName().length() == 0) {
            smartContractModel.setName(iface.getName() + ".sol");
        }
    }

    @Override
    public void enterContractDefinition(SolidityParser.ContractDefinitionContext ctx) {
        SmartContract sc = new SmartContractImpl(ctx.identifier().getText());
        smartContractModel.getDefinitions().getContracts().add(sc);
        if (smartContractModel.getName().length() == 0) {
            smartContractModel.setName(sc.getName() + ".sol");
        }
    }

    @Override
    public void exitContractDefinition(SolidityParser.ContractDefinitionContext ctx) {

        if (latestParsedFunction != null) {
            // Contract at last position is the current contract to be parsed
            smartContractModel.getDefinitions().getContracts().get(smartContractModel.getDefinitions().getContracts().size() - 1)
                    .getDefinitions().getFunctions().add(latestParsedFunction);

            latestParsedFunction = null;
        }
    }

    @Override
    public void exitInterfaceDefinition(SolidityParser.InterfaceDefinitionContext ctx) {
        if (latestParsedFunction != null) {
            // Contract at last position is the current contract to be parsed
            smartContractModel.getDefinitions().getInterfaces().get(smartContractModel.getDefinitions().getInterfaces().size() - 1)
                    .getDefinitions().getFunctions().add(latestParsedFunction);

            latestParsedFunction = null;
        }
    }

    @Override
    public void enterFunctionDefinition(SolidityParser.FunctionDefinitionContext ctx) {
        Function f = new FunctionImpl(ctx.identifier().getText());
        f.getParameters().addAll(enterParameterListReturnsIntermediateSolidityParams(ctx.arguments));
        f.getReturns().addAll(enterParameterListReturnsIntermediateSolidityParams(ctx.returnParameters));

        latestParsedFunction = f;
    }

    public List<FunctionParameter> enterParameterListReturnsIntermediateSolidityParams(SolidityParser.ParameterListContext ctx) {
        if (ctx == null || ctx.parameters == null) {
            return Collections.emptyList();
        }
        List<FunctionParameter> l = new LinkedList<>();

        ctx.parameters.forEach(it -> {
            // return value names are optional
            String paramName = it.name != null ? it.name.getText() : "";
            FunctionParameter p = new FunctionParameterImpl(paramName, new TypeImpl(it.type.getText()));
            if (it.dataLocation() != null) {
                p.setDataLocation(DataLocation.Companion.parse(it.location.getText()));
            }

            l.add(p);
        });

        return l;
    }

    public SmartContractModel getSmartContractModel() {
        return smartContractModel;
    }
}
