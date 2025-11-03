package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

public abstract class Mamifero extends Animal {

    public Mamifero(String nome, int idade) {
        super(nome, idade);
    }

    public void mamar() {
        System.out.println(getNome() + " está mamando.");
    }
}
