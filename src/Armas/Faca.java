package Armas;

import Interfaces.*;

/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 * 
 */
public class Faca implements IArma {

    @Override
    public int atacar() {
        return 5;
    }
}
