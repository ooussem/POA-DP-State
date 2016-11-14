import fr.machine.state.State;
import fr.machine.state.StateAccept;

/**
 * Created by OOussema on 14/11/2016.
 */
public class Machine {
    private State state;
    private int c;

    public Machine(){
        state = state.give(c);
    }

    public void give(int n){
        state = state.give(n);
    }

    public void askCoffee(){
        state = state.askCafe();
    }
    public void askThe(){
        state = state.askThe();
    }


}
