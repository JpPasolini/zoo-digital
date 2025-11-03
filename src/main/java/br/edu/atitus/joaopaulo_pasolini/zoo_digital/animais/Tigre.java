package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.Predador;

public class Tigre extends Mamifero implements Corredor, Nadador, Predador {

    public Tigre(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O tigre faz: Rooooar!");
    }

    @Override
    public void comer() {
        System.out.println("O tigre está comendo carne.");
    }

    @Override
    public void cacar() {
        System.out.println("O tigre está caçando sua presa.");
    }

    @Override
    public void nadar() {
        System.out.println("O tigre está nadando agilmente.");
    }

    @Override
    public void correr() {
        System.out.println("O tigre está correndo em alta velocidade.");
    }
}
