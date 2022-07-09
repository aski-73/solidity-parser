package net.aveyon;

import net.aveyon.intermediate_solidity.DataLocation;
import net.aveyon.intermediate_solidity.Function;
import net.aveyon.intermediate_solidity.SmartContractModel;
import net.aveyon.solidity_parser.App;
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
        SmartContractModel scm = new App().parse(path);

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
        SmartContractModel scm = new App().parse(path);

        // THEN
        assertNotNull(scm);
        assertEquals("TestContract", scm.getDefinitions().getContracts().get(0).getName());
    }

    @Test
    public void parsesFunctionParametersAndReturnsFunctionWithCorrectParameterList() {
        // GIVEN
        String path = Objects.requireNonNull(this.getClass().getClassLoader()
                        .getResource("./TestContractFunctionParameters.sol"))
                .getPath();

        // WHEN
        SmartContractModel scm = new App().parse(path);

        // THEN
        assertNotNull(scm);
        Function f = scm.getDefinitions().getContracts().get(0).getDefinitions().getFunctions().get(0);
        assertNotNull(f);
        // Params
        assertEquals(3, f.getParameters().size());
        assertEquals("a", f.getParameters().get(0).getName());
        assertEquals("uint", f.getParameters().get(0).getType());
        assertEquals("s", f.getParameters().get(1).getName());
        assertEquals("string", f.getParameters().get(1).getType());
        assertEquals(DataLocation.MEMORY, f.getParameters().get(1).getDataLocation());
        assertEquals("e", f.getParameters().get(2).getName());
        assertEquals("Entity", f.getParameters().get(2).getType());
        assertEquals(DataLocation.MEMORY, f.getParameters().get(2).getDataLocation());
        // Returns
        assertEquals("string", f.getReturns().get(0));
    }
}
