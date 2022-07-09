package net.aveyon.solidity_parser;

import net.aveyon.intermediate_solidity.SmartContractModel;

public interface Api {
    SmartContractModel parse(String solidityFilePath);
}
