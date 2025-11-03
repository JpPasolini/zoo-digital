package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Predador;

public class Pirarucu extends Peixe implements Nadador, Predador {

    public Pirarucu(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O pirarucu faz 'Blub' (é um peixe).");
    }

    @Override
    public void comer() {
        System.out.println("O pirarucu está comendo peixes menores.");
    }

    @Override
    public void nadar() {
        System.out.println("O pirarucu está nadando no rio.");
    }

    @Override
    public void cacar() {
        System.out.println("O pirarucu está caçando.");
    }
}
