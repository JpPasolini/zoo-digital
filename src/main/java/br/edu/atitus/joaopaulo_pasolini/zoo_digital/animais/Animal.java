package br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais;

public abstract class Animal {
    
    private static int contador = 0;

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        Animal.contador++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static int getContador() {
        return contador;
    }

    public abstract void emitirSom();

    public abstract void comer();

}
