package net.aveyon;

import net.aveyon.intermediate_solidity.Interface;
import net.aveyon.intermediate_solidity.SmartContract;
import net.aveyon.intermediate_solidity.SmartContractModel;
import net.aveyon.intermediate_solidity.impl.InterfaceImpl;
import net.aveyon.intermediate_solidity.impl.SmartContractImpl;
import net.aveyon.intermediate_solidity.impl.SmartContractModelImpl;
import net.aveyon.parser.SolidityParser;
import net.aveyon.parser.SolidityParserBaseListener;

public class MyListener extends SolidityParserBaseListener {
    private SmartContractModel smartContractModel;

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
    }

    public SmartContractModel getSmartContractModel() {
        return smartContractModel;
    }
}
