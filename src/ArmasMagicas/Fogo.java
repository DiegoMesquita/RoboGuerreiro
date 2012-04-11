package ArmasMagicas;

import Interfaces.*;
import Decorator.*;

public class Fogo extends Decorator {

    public Fogo(IArma referencia) {
        super(referencia);

    }

    public int atacar() {
        return super.getDano() + 2;
    }
}
