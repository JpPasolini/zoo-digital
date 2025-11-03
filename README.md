# 🐘 Zoo Digital (CLI)

Bem-vindo ao Zoo Digital! 🐾

Este projeto é uma simulação de um sistema de gerenciamento de zoológico que funciona inteiramente pela linha de comando (CLI).

Foi desenvolvido como uma atividade para consolidar os principais conceitos de **Programação Orientada a Objetos (POO)** em Java, mostrando como eles se conectam para criar uma aplicação robusta e flexível.

---

## ✨ Funcionalidades Principais

O programa apresenta um menu simples e direto, permitindo ao usuário:

* **Cadastrar novos animais:** Dê vida a leões, pinguins, cobras, tubarões e muitos outros.
* **Listar todos os animais:** Veja uma ficha completa de cada animal cadastrado, incluindo seu som e o que ele come.
* **Listar por comportamento:** Use filtros especiais para ver apenas os animais que sabem:
    * Correr 🏃
    * Nadar 🏊
    * Voar 🦅
    * Caçar 🐊
* **Ver contagem total:** Saiba exatamente quantos animais foram criados no sistema.

---

## 🧠 O que tem "por baixo dos panos"?

Para fazer tudo isso funcionar, o projeto foi estruturado usando os pilares da POO:

* 🏛️ **Herança e Classes Abstratas:** Foi criada uma hierarquia lógica. Um `Leao` é um `Mamifero`, que é um `Animal`. Isso evita repetição de código e organiza o projeto em "famílias" (Mamíferos, Aves, Répteis, Peixes).

* 🧩 **Interfaces:** Usamos interfaces como "pacotes de habilidades". Um animal pode ser um `Nadador`, um `Voador` ou um `Predador`. Isso nos dá flexibilidade total: um `Pato` (Ave) pode nadar, mas um `Jacare` (Réptil) também!

* 🎭 **Polimorfismo:** É a mágica que permite ao sistema pedir para *qualquer* animal `emitirSom()` e ele saber exatamente qual som fazer (seja um "Roar!", "Miau" ou "Sssss!").

* 📦 **Encapsulamento:** Cada classe protege seus dados (atributos privados) e só expõe o necessário através de métodos (getters/setters), tornando o código seguro e fácil de manter.

---

## 🛠️ Tecnologias Utilizadas

* **Java**
* **Maven** (Gerenciamento do projeto e dependências)
* **Git & GitHub** (Versionamento e entrega)

---

## 🏁 Como Executar

1.  Clone este repositório para o seu computador.
2.  Abra sua IDE favorita (Eclipse, IntelliJ, etc.).
3.  Importe o projeto como um **"Existing Maven Project"**.
4.  Encontre a classe principal (`App.java` ou `ZooDigitalApp.java`) e execute-a.
5.  O menu interativo aparecerá no seu console!

---

Projeto desenvolvido por **JpPasolini** 🚀
