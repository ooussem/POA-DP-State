import exception.MachineException;
import fr.machine.state.State;
import fr.machine.state.StateAccept;
import fr.machine.state.StateNotAccept;

/**
 * Created by OOussema on 14/11/2016.
 */
public class Machine {
    private State state;
    private int c;

    public Machine(){
        this.state = new StateNotAccept(0);
    }

    public void askCoffee() throws MachineException {
        this.state = state.askCafe();
    }

    public void askThe() throws MachineException {
        this.state = state.askThe();
    }

    public void give(int somme){
        this.state = state.give(somme);
    }




}
