package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Predador;

public class Crocodilo extends Reptil implements Nadador, Predador {

    public Crocodilo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O crocodilo faz um som gutural.");
    }

    @Override
    public void comer() {
        System.out.println("O crocodilo está comendo.");
    }

    @Override
    public void cacar() {
        System.out.println("O crocodilo está caçando na beira do rio.");
    }

    @Override
    public void nadar() {
        System.out.println("O crocodilo está nadando furtivamente.");
    }
}
