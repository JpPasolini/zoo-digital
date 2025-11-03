package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Corredor;

public class Lagarto extends Reptil implements Corredor {

    public Lagarto(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O lagarto faz... (nenhum som alto).");
    }

    @Override
    public void comer() {
        System.out.println("O lagarto está comendo insetos.");
    }

    @Override
    public void correr() {
        System.out.println("O lagarto está correndo rapidamente.");
    }
}
