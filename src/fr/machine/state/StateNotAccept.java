package fr.machine.state;

/**
 * Created by OOussema on 14/11/2016.
 */
public class StateNotAccept implements State {
    private int c;
    public StateNotAccept() {

    }

    @Override
    public State give(int n) {
        if((c+n)<10){
            return new StateNotAccept();
        }
        else return this;
    }


    //Il faut gérer les exceptions
    @Override
    public State askCafe() {
        return new StateAccept(0);
    }

    @Override
    public State askThe() {
        return new StateAccept(0);
    }
}
