package net.aveyon;

import net.aveyon.intermediate_solidity.SmartContractModel;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class AppIT {
    @Test
    public void parsesTestInterfaceAndReturnsInterfaceName() {
        // GIVEN
        String path = Objects.requireNonNull(this.getClass().getClassLoader().getResource("./TestInterface.sol"))
                .getPath();

        // WHEN
        SmartContractModel scm = App.parse(path);

        // THEN
        assertNotNull(scm);
        assertEquals("TestInterface", scm.getDefinitions().getInterfaces().get(0).getName());
    }

    @Test
    public void parsesTestContractAndReturnsContractName() {
        // GIVEN
        String path = Objects.requireNonNull(this.getClass().getClassLoader().getResource("./TestContract.sol"))
                .getPath();

        // WHEN
        SmartContractModel scm = App.parse(path);

        // THEN
        assertNotNull(scm);
        assertEquals("TestContract", scm.getDefinitions().getContracts().get(0).getName());
    }
}
