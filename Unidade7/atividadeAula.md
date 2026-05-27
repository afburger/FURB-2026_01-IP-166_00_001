# 📋 Lista de Exercícios — Revisão Geral

**Disciplina:** Introdução à Programação
**Conteúdos:** Orientação a Objetos (classes, métodos, construtores), `if/else`, `switch`, `for`, `while`, `do-while`, vetores e matrizes.

> Os exercícios estão em ordem crescente de dificuldade. Cada um mescla vários dos conteúdos vistos em aula.

---

## Uni7Exe01 — Cadastro de Alunos

Uma escola precisa de um sistema simples para cadastrar até **5 alunos** e suas notas finais.

### O que fazer

1. Crie uma classe `Aluno` com os atributos `nome` (String) e `nota` (double), e um construtor que receba ambos.

2. Crie um método `situacao()` que retorne:
   - `"Aprovado"` se a nota for **>= 7.0**
   - `"Recuperação"` se a nota for **>= 4.0 e < 7.0**
   - `"Reprovado"` se a nota for **< 4.0**

3. No `main`, use um vetor de `Aluno` com tamanho 5.

4. Use um `for` para pedir o nome e a nota de cada aluno e armazenar no vetor.

5. Após o cadastro, percorra o vetor com outro `for` e exiba o nome, a nota e a situação de cada aluno.

### Exemplo de saída

```
=== CADASTRO ===
Aluno 1 - Nome: Maria
Aluno 1 - Nota: 8.5
Aluno 2 - Nome: João
Aluno 2 - Nota: 5.0
...

=== RESULTADO ===
Maria - 8.5 - Aprovado
João - 5.0 - Recuperação
...
```

### Conceitos exercitados

`classe`, `construtor`, `método com retorno`, `if/else`, `vetor de objetos`, `for`

---

## Uni7Exe02 — Cardápio de Lanchonete

Uma lanchonete quer um programa para registrar pedidos. O cardápio tem 3 itens com preços fixos.

### O que fazer

1. Crie uma classe `Pedido` com os atributos `nomeItem` (String), `quantidade` (int) e `precoUnitario` (double), e um construtor que receba os três.

2. Crie um método `calcularTotal()` que retorne `quantidade * precoUnitario`.

3. No `main`, use um vetor de `Pedido` com tamanho 10 (máximo de itens por comanda). Use uma variável `totalPedidos` para controlar quantos já foram adicionados.

4. Exiba um menu com `do-while` (repete até sair):
   - `1 — Adicionar item`
   - `2 — Ver comanda`
   - `0 — Fechar e pagar`

5. Na opção 1, use um `switch` para o cardápio:
   - `1 — X-Burger (R$ 18.50)`
   - `2 — X-Salada (R$ 16.00)`
   - `3 — Suco Natural (R$ 8.00)`

   Após escolher, pergunte a quantidade e crie o `Pedido` no vetor. Se o vetor estiver cheio (10 itens), exiba `"Comanda cheia!"`.

6. Na opção 2, percorra os pedidos com `for` e exiba cada item com nome, quantidade e subtotal. Ao final, mostre o valor total da comanda.

7. Na opção 0, exiba o total e encerre.

### Exemplo de saída

```
=== LANCHONETE ===
1 - Adicionar item
2 - Ver comanda
0 - Fechar e pagar
Opção: 1

Cardápio:
1 - X-Burger (R$ 18.50)
2 - X-Salada (R$ 16.00)
3 - Suco Natural (R$ 8.00)
Item: 1
Quantidade: 2
Adicionado!

Opção: 2
=== COMANDA ===
X-Burger x2 = R$ 37.00
TOTAL: R$ 37.00

Opção: 0
Total a pagar: R$ 37.00
Obrigado, volte sempre!
```

### Conceitos exercitados

`classe`, `construtor`, `método com retorno`, `switch` (menu + cardápio), `do-while`, `vetor de objetos`, `for`, `if/else`

---

## Uni7Exe03 — Controle de Estoque

Uma loja de eletrônicos precisa controlar o estoque de **8 produtos**. O sistema deve permitir consultar, vender e repor itens.

### O que fazer

1. Crie uma classe `Produto` com os atributos `nome` (String), `preco` (double) e `estoque` (int), e um construtor que receba os três.

2. Crie os métodos:
   - `vender(int qtd)` — se `qtd` for maior que o estoque, exiba `"Estoque insuficiente! Disponível: X"` e não venda. Caso contrário, diminua o estoque e exiba `"Venda realizada!"`.
   - `repor(int qtd)` — aumente o estoque.
   - `estaEmBaixa()` — retorne `true` se o estoque for **<= 3**.

3. No `main`, crie um vetor com 8 produtos pré-cadastrados (não precisa pedir ao usuário — defina direto no código).

4. Menu com `while` (repete enquanto opção != 0):
   - `1 — Listar produtos`
   - `2 — Vender`
   - `3 — Repor estoque`
   - `0 — Sair`

   Use `switch` para tratar as opções.

5. Na opção 1, use um `for` para listar todos os produtos com código (posição + 1), nome, preço e estoque. Se o produto `estaEmBaixa()`, exiba `"⚠ BAIXO"` ao lado.

6. Nas opções 2 e 3, peça o código do produto e a quantidade. Valide se o código é válido (1 a 8) com `if/else`. Se for válido, chame o método correspondente.

### Exemplo de saída

```
=== ESTOQUE ===
1 - Listar produtos
2 - Vender
3 - Repor estoque
0 - Sair
Opção: 1

Cód | Produto         | Preço    | Estoque
1   | Fone Bluetooth  | R$ 89.90 | 2 ⚠ BAIXO
2   | Mouse Gamer     | R$ 149.90| 15
3   | Teclado Mec.    | R$ 299.90| 1 ⚠ BAIXO
...

Opção: 2
Código do produto: 1
Quantidade: 5
Estoque insuficiente! Disponível: 2

Opção: 3
Código do produto: 1
Quantidade: 10
Estoque reposto!

Opção: 0
Encerrando sistema.
```

### Conceitos exercitados

`classe`, `construtor`, `métodos void e com retorno`, `if/else`, `switch`, `while`, `for`, `vetor de objetos`, `validação de entrada`

---

## Uni7Exe04 — Mapa de Assentos de Cinema

Um cinema com **5 salas** precisa de um sistema para gerenciar os assentos. Cada sala tem **4 fileiras e 6 colunas** de assentos (matriz 4x6).

### O que fazer

1. Crie uma classe `Sala` com os atributos `numero` (int) e `assentos` (matriz `boolean[4][6]` — `false` = livre, `true` = ocupado).

2. Crie os métodos:
   - `exibirMapa()` — percorra a matriz com `for` aninhado e exiba `[ ]` para livre e `[X]` para ocupado. Mostre os números das colunas no topo e as letras das fileiras (A, B, C, D) na lateral.
   - `reservar(int fileira, int coluna)` — se o assento já estiver ocupado, exiba `"Assento já ocupado!"`. Se estiver livre, marque como ocupado e exiba `"Reserva confirmada!"`. Use `if/else`.
   - `cancelar(int fileira, int coluna)` — lógica inversa da reserva.
   - `percentualOcupacao()` — retorne a porcentagem de assentos ocupados (conte os `true` com `for` aninhado, divida por 24, multiplique por 100).

3. No `main`, crie um vetor de 5 objetos `Sala`.

4. Menu com `do-while`:
   - `1 — Escolher sala e ver mapa`
   - `2 — Reservar assento`
   - `3 — Cancelar reserva`
   - `0 — Sair`

   Use `switch` para as opções.

5. Nas opções 1, 2 e 3: peça o número da sala (1 a 5). Valide com `if/else`. Na opção 1, exiba o mapa e o percentual de ocupação. Nas opções 2 e 3, peça fileira (A-D) e coluna (1-6), converta a fileira para índice (A=0, B=1...) e chame o método correspondente.

### Exemplo de saída

```
=== CINEMA ===
1 - Ver mapa da sala
2 - Reservar assento
3 - Cancelar reserva
0 - Sair
Opção: 1
Sala (1-5): 2

=== SALA 2 ===
    1   2   3   4   5   6
A [ ] [ ] [X] [ ] [ ] [ ]
B [ ] [ ] [ ] [ ] [ ] [ ]
C [ ] [ ] [ ] [X] [ ] [ ]
D [ ] [ ] [ ] [ ] [ ] [ ]
Ocupação: 8.3%

Opção: 2
Sala (1-5): 2
Fileira (A-D): A
Coluna (1-6): 3
Assento já ocupado!

Opção: 2
Sala (1-5): 2
Fileira (A-D): B
Coluna (1-6): 4
Reserva confirmada!
```

### Conceitos exercitados

`classe`, `construtor`, `métodos void e com retorno`, `if/else`, `switch`, `do-while`, `for` aninhado, `vetor de objetos`, `matriz de boolean`, `conversão char→int`

---

## Uni7Exe05 — Torneio de Jogadores

Um campeonato de e-sports tem **4 jogadores** que disputam **3 rodadas**. Cada rodada gera pontuações que devem ser armazenadas e analisadas.

### O que fazer

1. Crie uma classe `Jogador` com os atributos:
   - `nome` (String)
   - `pontuacoes` (vetor `int[3]` — uma por rodada)

2. Crie os métodos:
   - `registrarPontuacao(int rodada, int pontos)` — armazene a pontuação na rodada informada. Valide se a rodada é válida (0 a 2) com `if/else`.
   - `totalPontos()` — retorne a soma das 3 rodadas usando um `for`.
   - `mediaPontos()` — retorne a média usando `totalPontos()`.
   - `melhorRodada()` — retorne o número da rodada (1, 2 ou 3) em que o jogador fez mais pontos. Use `for` para encontrar o maior.
   - `classificacao()` — retorne uma String usando `if/else`:
     - Total >= 2500: `"Ouro 🥇"`
     - Total >= 1500: `"Prata 🥈"`
     - Total >= 800: `"Bronze 🥉"`
     - Abaixo: `"Sem classificação"`

3. No `main`, use uma **matriz `int[4][3]`** como tabela geral do torneio (4 jogadores × 3 rodadas). Crie também um vetor de 4 objetos `Jogador`.

4. Use um `for` para pedir o nome de cada jogador. Depois, use `for` aninhado para pedir a pontuação de cada rodada de cada jogador. Armazene tanto no objeto (via `registrarPontuacao`) quanto na matriz.

5. Menu com `do-while`:
   - `1 — Tabela geral` — exiba a matriz formatada (linhas = jogadores, colunas = rodadas) usando `for` aninhado. Na última coluna, exiba o total.
   - `2 — Ranking final` — percorra o vetor de jogadores e exiba nome, total, média, melhor rodada e classificação. Use um `while` para encontrar o jogador com maior total e exiba `"🏆 CAMPEÃO"` ao lado dele.
   - `3 — Buscar jogador` — peça o nome. Percorra o vetor com `while` procurando pelo nome. Se encontrar, exiba os detalhes. Se não, exiba `"Jogador não encontrado."`.
   - `0 — Sair`

   Use `switch` para as opções.

### Exemplo de saída

```
=== CADASTRO ===
Jogador 1 - Nome: Ana
  Rodada 1: 900
  Rodada 2: 850
  Rodada 3: 1100
Jogador 2 - Nome: Beto
  Rodada 1: 600
  ...

Opção: 1
=== TABELA GERAL ===
Jogador   | R1   | R2   | R3   | Total
Ana       | 900  | 850  | 1100 | 2850
Beto      | 600  | 700  | 500  | 1800
Carlos    | 200  | 300  | 250  | 750
Diana     | 1000 | 950  | 1050 | 3000

Opção: 2
=== RANKING FINAL ===
Diana  - Total: 3000 - Média: 1000.0 - Melhor: Rodada 3 - Ouro 🥇 🏆 CAMPEÃO
Ana    - Total: 2850 - Média: 950.0  - Melhor: Rodada 3 - Ouro 🥇
Beto   - Total: 1800 - Média: 600.0  - Melhor: Rodada 2 - Prata 🥈
Carlos - Total: 750  - Média: 250.0  - Melhor: Rodada 2 - Sem classificação

Opção: 3
Nome: Ana
=== DETALHES ===
Nome: Ana
Rodadas: 900 | 850 | 1100
Total: 2850 | Média: 950.0
Melhor rodada: 3
Classificação: Ouro 🥇

Opção: 0
Fim do torneio!
```

### Conceitos exercitados

`classe`, `construtor`, `múltiplos métodos (void e com retorno)`, `if/else` (validação + classificação), `switch`, `for`, `for aninhado`, `while` (busca + maior valor), `do-while` (menu), `vetor de objetos`, `vetor de int (atributo)`, `matriz int[][]`

---

**Boa prática:** teste cada exercício com pelo menos 3 cenários diferentes antes de considerar pronto. Isso evita 90% dos problemas. 👍
