package fr.machine.state;

import exception.MachineException;

/**
 * Created by OOussema on 14/11/2016.
 */
public class StateNotAccept implements State {
    private int c;

    public StateNotAccept(int c) {
        this.c = c;
    }

    @Override
    public State give(int n) {
        if((c+n)<10){
            return this;
        }
        else return new StateAccept(this.c);
    }


    //Il faut gérer les exceptions
    @Override
    public State askCafe() throws MachineException{
        throw new MachineException("Pas assez d'argent");
    }

    @Override
    public State askThe() throws MachineException{
        throw new MachineException("Pas assez d'argent");
    }
}
