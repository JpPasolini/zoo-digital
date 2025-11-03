package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Predador;

public class Lobo extends Mamifero implements Corredor, Predador {

    public Lobo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O lobo faz: Auuuuuuuu!");
    }

    @Override
    public void comer() {
        System.out.println("O lobo está comendo.");
    }

    @Override
    public void cacar() {
        System.out.println("O lobo está caçando em matilha.");
    }

    @Override
    public void correr() {
        System.out.println("O lobo está correndo pela floresta.");
    }
}
