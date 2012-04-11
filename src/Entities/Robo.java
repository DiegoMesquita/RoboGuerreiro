package Entities;


import Interfaces.*;


/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 * 
 */
public class Robo {

    private String nome;
    private IArma arma;
    private IArmadura armadura;
    private int energia;

    public Robo(String nome, IArma arma, IArmadura armadura, int energia) {
        this.nome = nome;
        this.arma = arma;
        this.armadura = armadura;
        this.energia = energia;
    }

    public IArma getArma() {
        return arma;
    }

    public void setArma(IArma arma) {
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    //Se energia = 0, robo foi destruido
    public int getEnergia() {
        if (energia == 0) {
            System.out.println(nome + " foi destruido");
        }
        return energia;
    }

    //Caso energia fique negativo, iguala a 0
    public void setEnergia(int energia) {
        if (energia <= 0) {
            this.energia = 0;
        } else {
            this.energia = energia;
        }
    }

    public IArmadura getArmadura() {
        return armadura;
    }

    public void setArmadura(IArmadura armadura) {
        this.armadura = armadura;
    }

    public void atacar(Robo robo) {
        if (robo.armadura.defender() < arma.atacar()) {
            robo.setEnergia(robo.getEnergia() - arma.atacar());
        } else {
            System.out.println("Nenhum dano sofrido por " + nome);
        }
    }

    public void changeArma(IArma arma) {
        setArma(arma);
    }

    public void changeArmadura(IArmadura armadura) {
        setArmadura(armadura);
    }
}
