package Decorator;


import Interfaces.*;


public abstract class Decorator implements IArma {

    private IArma referencia = null;

    public Decorator(IArma referencia) {
        this.referencia = referencia;
    }

    public int getDano() {
        return referencia.atacar();
    }
}