package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Predador;
import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Voador;

public class Coruja extends Ave implements Voador, Predador {

    public Coruja(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A coruja faz: Huu Huu!");
    }

    @Override
    public void comer() {
        System.out.println("A coruja está comendo um rato.");
    }

    @Override
    public void cacar() {
        System.out.println("A coruja está caçando à noite.");
    }

    @Override
    public void voar() {
        System.out.println("A coruja está voando silenciosamente.");
    }
}
