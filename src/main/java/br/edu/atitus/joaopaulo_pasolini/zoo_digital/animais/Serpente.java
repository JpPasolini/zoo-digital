package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Predador;

public class Serpente extends Reptil implements Predador {

    public Serpente(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A serpente faz: Sssssss!");
    }

    @Override
    public void comer() {
        System.out.println("A serpente está engolindo sua presa.");
    }

    @Override
    public void cacar() {
        System.out.println("A serpente está dando o bote.");
    }
}
