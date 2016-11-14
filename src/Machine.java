import fr.machine.state.State;
import fr.machine.state.StateOne;

/**
 * Created by OOussema on 14/11/2016.
 */
public class Machine {
    private State state;
    private int c;

    public Machine(){
        new StateOne();
    }

    void give(int n){

        if((this.c+n)>= 10 ){
            state = state.askCafe();
        }
        else
            state = state.askThe();
    }

}
