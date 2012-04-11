package ArmasMagicas;

import Interfaces.*;
import Decorator.*;

public class Veneno extends Decorator{

	public Veneno(IArma referencia) {
		super(referencia);
		
	}
	
	public int atacar(){
		return super.getDano()+ 5;
	}
}