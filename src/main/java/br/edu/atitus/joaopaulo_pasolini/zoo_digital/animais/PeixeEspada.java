package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Predador;

public class PeixeEspada extends Peixe implements Nadador, Predador {

    public PeixeEspada(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O peixe-espada faz 'Splash' (é um peixe).");
    }

    @Override
    public void comer() {
        System.out.println("O peixe-espada está comendo lulas.");
    }

    @Override
    public void nadar() {
        System.out.println("O peixe-espada está nadando muito rápido.");
    }

    @Override
    public void cacar() {
        System.out.println("O peixe-espada está usando seu 'bico' para caçar.");
    }
}
