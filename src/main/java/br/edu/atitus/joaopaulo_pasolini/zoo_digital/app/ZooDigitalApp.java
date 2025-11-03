package br.edu.atitus.joaopaulo_pasolini.zoo_digital.app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.joaopaulo_pasolini.zoo_digital.animais.*;
import br.edu.atitus.joaopaulo_pasolini.zoo_digital.comportamentos.*;

public class ZooDigitalApp {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        loopPrincipal();
    }

    private static void loopPrincipal() {
        boolean rodando = true;
        while (rodando) {
            exibirMenu();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    listarTodosAnimais();
                    break;
                case 3:
                    listarCorredores();
                    break;
                case 4:
                    listarNadadores();
                    break;
                case 5:
                    listarVoadores();
                    break;
                case 6:
                    listarPredadores();
                    break;
                case 7:
                    exibirTotalAnimais();
                    break;
                case 0:
                    rodando = false;
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            pressionarEnterParaContinuar();
        }
    }

    private static void exibirMenu() {
        System.out.println("\n--- 🐘 Zoo Digital (CLI) 🐾 ---");
        System.out.println("1. Cadastrar Animal");
        System.out.println("2. Listar Todos os Animais");
        System.out.println("3. Listar Animais Corredores");
        System.out.println("4. Listar Animais Nadadores");
        System.out.println("5. Listar Animais Voadores");
        System.out.println("6. Listar Animais Predadores");
        System.out.println("7. Exibir Total de Animais");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        try {
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            return opcao;
        } catch (InputMismatchException e) {
            scanner.nextLine(); 
            return -1;
        }
    }

    private static void pressionarEnterParaContinuar() {
        System.out.println("\nPressione ENTER para continuar...");
        scanner.nextLine();
    }

    private static void cadastrarAnimal() {
        System.out.println("\n--- Cadastro de Animal ---");
        System.out.println("Escolha a família do animal:");
        System.out.println("1. Mamífero");
        System.out.println("2. Ave");
        System.out.println("3. Réptil");
        System.out.println("4. Peixe");
        int familia = lerOpcao();

        Animal novoAnimal = null;
        String nome;
        int idade;

        try {
            switch (familia) {
                case 1: 
                    System.out.println("Qual mamífero? (1-Tigre, 2-Lobo)");
                    int tipoMamifero = lerOpcao();
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (tipoMamifero == 1) {
                        novoAnimal = new Tigre(nome, idade);
                    } else if (tipoMamifero == 2) {
                        novoAnimal = new Lobo(nome, idade);
                    }
                    break;
                case 2: 
                    System.out.println("Qual ave? (1-Águia, 2-Coruja)");
                    int tipoAve = lerOpcao();
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (tipoAve == 1) {
                        novoAnimal = new Aguia(nome, idade);
                    } else if (tipoAve == 2) {
                        novoAnimal = new Coruja(nome, idade);
                    }
                    break;
                case 3: 
                    System.out.println("Qual réptil? (1-Crocodilo, 2-Serpente, 3-Tartaruga, 4-Lagarto)");
                    int tipoReptil = lerOpcao();
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoReptil == 1) {
                        novoAnimal = new Crocodilo(nome, idade);
                    } else if (tipoReptil == 2) {
                        novoAnimal = new Serpente(nome, idade);
                    } else if (tipoReptil == 3) {
                        novoAnimal = new Tartaruga(nome, idade);
                    } else if (tipoReptil == 4) {
                        novoAnimal = new Lagarto(nome, idade);
                    }
                    break;
                case 4: 
                    System.out.println("Qual peixe? (1-Pirarucu, 2-Peixe-Espada)");
                    int tipoPeixe = lerOpcao();
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoPeixe == 1) {
                        novoAnimal = new Pirarucu(nome, idade);
                    } else if (tipoPeixe == 2) {
                        novoAnimal = new PeixeEspada(nome, idade);
                    }
                    break;
                default:
                    System.out.println("Família inválida.");
                    return;
            }

            if (novoAnimal != null) {
                animais.add(novoAnimal);
                System.out.println(novoAnimal.getNome() + " cadastrado com sucesso!");
            } else {
                System.out.println("Tipo de animal inválido.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Idade deve ser um número.");
            scanner.nextLine();
        }
    }

    private static void listarTodosAnimais() {
        System.out.println("\n--- Lista de Todos os Animais ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal animal : animais) {
            System.out.println("--------------------");
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Espécie: " + animal.getClass().getSimpleName());
            animal.emitirSom();
            animal.comer();
        }
    }

    private static void listarCorredores() {
        System.out.println("\n--- Lista de Animais Corredores 🏃 ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Corredor) {
                Corredor corredor = (Corredor) animal;
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getClass().getSimpleName() + ")");
                corredor.correr();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal corredor encontrado.");
        }
    }

    private static void listarNadadores() {
        System.out.println("\n--- Lista de Animais Nadadores 🏊 ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Nadador) {
                Nadador nadador = (Nadador) animal;
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getClass().getSimpleName() + ")");
                nadador.nadar();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal nadador encontrado.");
        }
    }

    private static void listarVoadores() {
        System.out.println("\n--- Lista de Animais Voadores 🦅 ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Voador) {
                Voador voador = (Voador) animal;
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getClass().getSimpleName() + ")");
                voador.voar();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal voador encontrado.");
        }
    }

    private static void listarPredadores() {
        System.out.println("\n--- Lista de Animais Predadores 🐊 ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Predador) {
                Predador predador = (Predador) animal;
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getClass().getSimpleName() + ")");
                predador.cacar();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal predador encontrado.");
        }
    }

    private static void exibirTotalAnimais() {
        System.out.println("\n--- Total de Animais ---");
        System.out.println("Total de animais cadastrados no sistema: " + Animal.getContador());
    }
}
