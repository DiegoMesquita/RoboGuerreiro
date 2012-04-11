
import Entities.Robo;
import Armaduras.*;
import Armas.*;
import ArmasMagicas.*;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 * 
 */
public class Main {

    public static void main(String[] args) {

        Robo r1 = new Robo("Schwarzenegger", new Espada(), new ArmaduraCompleta(), 70);
        Robo r2 = new Robo("Stallone", new Lanca(), new ArmaduraCouro(), 70);

        r1.atacar(r2);
        System.out.println("Energia " + r2.getNome() + ": " + r2.getEnergia());
        System.out.println();

        r2.atacar(r1);
        System.out.println("Energia " + r1.getNome() + ": " + r1.getEnergia());
        System.out.println();

        //Armadura + forte que arma
        r2.changeArma(new Faca());
        r2.atacar(r1);
        System.out.println("Energia " + r1.getNome() + ": " + r1.getEnergia());
        System.out.println();

        r1.changeArma(new Lanca());
        r1.atacar(r2);
        System.out.println("Energia " + r2.getNome() + ": " + r2.getEnergia());
        System.out.println();

        r1.changeArmadura(new ArmaduraCouro());
        r2.changeArma(new Lanca());
        r2.atacar(r1);
        System.out.println("Energia " + r1.getNome() + ": " + r1.getEnergia());
        System.out.println();

        r2.atacar(r1);
        System.out.println("Energia " + r1.getNome() + ": " + r1.getEnergia());

        //Decorator
        r1.changeArma(new Veneno(new Faca()));
        r1.atacar(r2);
        System.out.println("Energia " + r2.getNome() + ": " + r2.getEnergia());

        r2.changeArma(new Raio(new Lanca()));
        r2.atacar(r1);
        System.out.println("Energia " + r1.getNome() + ": " + r1.getEnergia());

    }
}