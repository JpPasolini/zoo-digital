package br.edu.atitus.joaopaulo_pasolini.animais;


public class Leao extends Animal {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " ruge alto!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne.");
    }
}
