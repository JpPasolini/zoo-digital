package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Predador;
import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Voador;

public class Aguia extends Ave implements Voador, Predador {

    public Aguia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A águia faz: Criiii!");
    }

    @Override
    public void comer() {
        System.out.println("A águia está comendo um peixe.");
    }

    @Override
    public void cacar() {
        System.out.println("A águia está caçando em voo.");
    }

    @Override
    public void voar() {
        System.out.println("A águia está voando alto.");
    }
}
