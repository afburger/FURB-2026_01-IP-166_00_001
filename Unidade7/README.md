# Orientação a Objetos — Classes e Métodos em Java

## O que é Orientação a Objetos?

Até agora, você escreveu código de forma **procedural**: uma sequência de instruções, uma atrás da outra. Funciona, mas imagine tentar organizar o código de um jogo inteiro assim — seria como guardar todas as suas roupas numa pilha só, sem gavetas nem cabides.

**Orientação a Objetos (OO)** é uma forma de organizar o código agrupando **dados** e **comportamentos** que pertencem ao mesmo conceito. Em vez de ter variáveis soltas e funções espalhadas, você cria **objetos** que representam coisas do mundo real (ou do seu sistema).

Pense no seu celular: ele tem **dados** (marca, modelo, bateria, armazenamento) e **comportamentos** (ligar, desligar, tirar foto, enviar mensagem). Em OO, o celular seria um **objeto**.

---

## O que é uma Classe?

Uma **classe** é um molde (ou planta) para criar objetos. Ela define:

- **Atributos** — os dados que o objeto vai guardar
- **Métodos** — os comportamentos que o objeto pode executar

### Analogia: A Classe é a Planta, o Objeto é a Casa

Quando um arquiteto desenha a planta de uma casa, ele não está construindo a casa — ele está definindo **como** a casa vai ser. A partir de uma mesma planta, você pode construir várias casas. Cada casa é um **objeto** diferente, mas todas seguem o mesmo **molde** (a classe).

### Sintaxe básica

```java
public class Cachorro {
    // Atributos (dados)
    String nome;
    String raca;
    int idade;

    // Método (comportamento)
    void latir() {
        System.out.println(nome + " diz: Au au!");
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
    }
}
```

### Criando objetos a partir da classe

```java
public class Main {
    public static void main(String[] args) {
        // Criando o primeiro objeto
        Cachorro dog1 = new Cachorro();
        dog1.nome = "Rex";
        dog1.raca = "Labrador";
        dog1.idade = 3;

        // Criando o segundo objeto
        Cachorro dog2 = new Cachorro();
        dog2.nome = "Luna";
        dog2.raca = "Golden Retriever";
        dog2.idade = 5;

        // Usando os métodos
        dog1.latir();   // Rex diz: Au au!
        dog2.latir();   // Luna diz: Au au!

        dog1.exibirInfo();
        // Nome: Rex
        // Raça: Labrador
        // Idade: 3 anos
    }
}
```

> **Perceba:** `dog1` e `dog2` são objetos diferentes, criados a partir da mesma classe `Cachorro`. Cada um tem seus próprios valores nos atributos.

---

## O que são Métodos?

Um **método** é uma ação que o objeto pode executar. É um bloco de código que pertence à classe e pode:

- Não receber nada e não retornar nada (como `latir()` acima)
- **Receber parâmetros** — dados de entrada
- **Retornar um valor** — o resultado de algum processamento

### Métodos sem retorno (`void`)

Quando o método faz alguma ação mas não precisa devolver um resultado:

```java
void cumprimentar(String pessoa) {
    System.out.println("Olá, " + pessoa + "! Tudo bem?");
}
```

### Métodos com retorno

Quando o método precisa calcular algo e devolver o resultado:

```java
int calcularIdadeHumana() {
    return idade * 7;
}
```

O tipo antes do nome do método indica o que ele retorna: `int`, `double`, `String`, `boolean`, etc.

### Exemplo completo

```java
public class Jogador {
    String nome;
    int pontuacao;
    int partidas;

    // Método com parâmetro
    void adicionarPontos(int pontos) {
        pontuacao = pontuacao + pontos;
        System.out.println(nome + " agora tem " + pontuacao + " pontos!");
    }

    // Método com retorno
    double calcularMedia() {
        if (partidas == 0) {
            return 0;
        }
        return (double) pontuacao / partidas;
    }

    // Método que usa outro método
    void exibirResumo() {
        System.out.println("=== " + nome + " ===");
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Partidas: " + partidas);
        System.out.println("Média: " + calcularMedia());
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        j1.nome = "Player1";
        j1.pontuacao = 0;
        j1.partidas = 3;

        j1.adicionarPontos(150);  // Player1 agora tem 150 pontos!
        j1.adicionarPontos(200);  // Player1 agora tem 350 pontos!

        j1.exibirResumo();
        // === Player1 ===
        // Pontuação: 350
        // Partidas: 3
        // Média: 116.66666666666667
    }
}
```

---

## Construtores

O **construtor** é um método especial que é chamado automaticamente quando você cria um objeto com `new`. Ele serve para inicializar os atributos de forma prática.

```java
public class Musica {
    String titulo;
    String artista;
    int duracaoSegundos;

    // Construtor
    Musica(String titulo, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    String duracaoFormatada() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        return minutos + ":" + String.format("%02d", segundos);
    }

    void exibir() {
        System.out.println(titulo + " - " + artista + " (" + duracaoFormatada() + ")");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        // Agora podemos criar o objeto já com os dados
        Musica m1 = new Musica("Bohemian Rhapsody", "Queen", 354);
        Musica m2 = new Musica("Blinding Lights", "The Weeknd", 200);

        m1.exibir();  // Bohemian Rhapsody - Queen (5:54)
        m2.exibir();  // Blinding Lights - The Weeknd (3:20)
    }
}
```

> **O `this`** se refere ao objeto atual. Quando o parâmetro tem o mesmo nome do atributo, usamos `this.atributo` para diferenciar.

---

## Resumo Visual

| Conceito     | O que é                          | Exemplo                              |
|--------------|----------------------------------|--------------------------------------|
| **Classe**   | O molde/planta                   | `class Cachorro { ... }`             |
| **Objeto**   | Uma instância criada a partir da classe | `Cachorro rex = new Cachorro();` |
| **Atributo** | Um dado do objeto                | `String nome;`                       |
| **Método**   | Um comportamento do objeto       | `void latir() { ... }`              |
| **Construtor** | Inicializa o objeto ao criá-lo | `Cachorro(String nome) { ... }`      |
| **`this`**   | Referência ao objeto atual       | `this.nome = nome;`                  |

---

## Exercício Rápido

Imagine que você está construindo o back-end de um app de delivery. Crie uma classe `Pedido` com:

- **Atributos:** `nomeCliente`, `descricaoItem`, `valor` (double), `entregue` (boolean)
- **Construtor** que receba o nome do cliente, a descrição do item e o valor
- **Método** `entregar()` que mude `entregue` para `true` e imprima "Pedido entregue para [nome]!"
- **Método** `exibirStatus()` que mostre os dados e se está "Entregue" ou "Pendente"

Depois, no `main`, crie 2 pedidos, entregue um deles e exiba o status dos dois.
