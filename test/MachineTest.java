import exception.MachineException;
import fr.machine.state.*;
import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 15/11/2016.
 */
public class MachineTest {
    Machine machine;
    State state;


    @BeforeTest
    public void setUp() throws Exception {
            machine = new Machine();
    }

    @AfterTest
    public void tearDown() throws Exception {
        machine = null;
        state = null;
    }

    @Test
    public void testAskCoffee() throws Exception, MachineException {
        machine.give(5);
        machine.askCoffee();
        state = new StateNotAccept(2);
        assertNotEquals(machine.getState().getClass().getName(), state.getClass().getName());
    }

    @Test
    public void testAskThe() throws Exception, MachineException {
        machine.give(15);
        machine.askThe();
        state = new StateAccept();
        assertEquals(machine.getState().getClass().getName(), state.getClass().getName());

    }

    @Test
    public void testGive() throws Exception, MachineException {
        machine.give(10);
        state = new StateAccept(10);
        assertEquals(machine.getState().getClass().getName(),state.getClass().getName());
    }

}