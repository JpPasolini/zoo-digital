package br.edu.atitus.joaopaulo_pasolini.app;


import java.util.Scanner;
import br.edu.atitus.joaopaulo_pasolini.animais.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== 🦁 ZOO DIGITAL 🐦 ===");
            System.out.println("1 - Criar Leão");
            System.out.println("2 - Criar Pássaro");
            System.out.println("3 - Criar Peixe");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Leao leao = new Leao("Simba", 5);
                    leao.emitirSom();
                    leao.comer();
                    break;

                case 2:
                    Passaro passaro = new Passaro("Piu", 2);
                    passaro.emitirSom();
                    passaro.comer();
                    passaro.voar();
                    break;

                case 3:
                    Peixe peixe = new Peixe("Nemo", 1);
                    peixe.emitirSom();
                    peixe.comer();
                    peixe.nadar();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
