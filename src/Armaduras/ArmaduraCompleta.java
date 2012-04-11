package Armaduras;

import Interfaces.IArmadura;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 * 
 */
public class ArmaduraCompleta implements IArmadura {

    @Override
    public int defender() {
        return 10;
    }
}
