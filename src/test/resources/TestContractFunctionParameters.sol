// SPDX-License-Identifier: GPL-3.0
pragma solidity ^0.8.4;

contract TestContract {
    struct Entity {
        uint id;
        string name;
    }

    function updateEntity(uint a, string memory s, Entity memory e) external pure returns (string memory) {
        e.id = a + 5;
        e.name = s;
        return "Update successful";
    }
}
