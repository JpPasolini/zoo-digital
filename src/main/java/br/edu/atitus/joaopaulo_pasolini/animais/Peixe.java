package br.edu.atitus.joaopaulo_pasolini.animais;

import br.edu.atitus.joaopaulo_pasolini.comportamentos.Nadador;

public class Peixe extends Animal implements Nadador {

    public Peixe(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " não emite som perceptível.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo algas.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando rapidamente!");
    }
}
