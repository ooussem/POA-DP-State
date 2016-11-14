package fr.machine.state;

import exception.MachineException;

/**
 * Created by OOussema on 14/11/2016.
 */
public interface State {
    public State give(int n);
    public State askCafe();
    public State askThe();

}
