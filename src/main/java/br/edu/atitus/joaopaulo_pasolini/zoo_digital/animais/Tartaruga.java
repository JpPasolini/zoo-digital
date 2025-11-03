package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Nadador;

public class Tartaruga extends Reptil implements Nadador {

    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A tartaruga faz um som baixo.");
    }

    @Override
    public void comer() {
        System.out.println("A tartaruga está comendo algas/vegetais.");
    }

    @Override
    public void nadar() {
        System.out.println("A tartaruga (marinha) está nadando graciosamente.");
    }
}
