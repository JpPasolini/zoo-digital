package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

public abstract class Ave extends Animal {

    public Ave(String nome, int idade) {
        super(nome, idade);
    }

    public void botarOvo() {
        System.out.println(getNome() + " está botando um ovo.");
    }
}
