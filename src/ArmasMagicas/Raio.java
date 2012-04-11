package ArmasMagicas;

import Interfaces.*;
import Decorator.*;


public class Raio extends Decorator {

    public Raio(IArma referencia) {
        super(referencia);
    }

    public int atacar() {
        return super.getDano() + 10;
    }
}
