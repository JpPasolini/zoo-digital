package br.edu.atitus.joaopaulo_pasolini.animais;

import br.edu.atitus.joaopaulo_pasolini.comportamentos.Voador;

public class Passaro extends Animal implements Voador {

    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando alegremente!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando pelo céu!");
    }
}
