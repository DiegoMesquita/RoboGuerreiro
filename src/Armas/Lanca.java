package Armas;

import Interfaces.*;

/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 * 
 */
public class Lanca implements IArma {

    @Override
    public int atacar() {
        return 20;
    }
}
