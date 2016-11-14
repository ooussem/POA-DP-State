package fr.machine.state;

import exception.MachineException;

/**
 * Created by OOussema on 14/11/2016.
 */
public class StateAccept implements State {
    private int c;

    public StateAccept(int credit) {
        this.c = credit;
    }


    @Override
    public State give(int n) throws MachineException {
        /* Le code ci dessous est un non sens
        car on est dans l'état accept
        donc le client ne peut pas ajouter de l'argent
        on lève donc une exception.

        if((c+n)>=10){
            return new StateNotAccept(this.c);
        }
        else return this;
        */
        throw new MachineException("Je garde le surplus d'argent pour me payer un caffé!!");
    }


    //Il faut gérer les exceptions
    @Override
    public State askCafe() {
        System.out.println("En cours de préparation");
        return new StateNotAccept(0);
    }

    @Override
    public State askThe() {
        System.out.println("En cours de préparation");
        return new StateNotAccept(0);
    }
}
