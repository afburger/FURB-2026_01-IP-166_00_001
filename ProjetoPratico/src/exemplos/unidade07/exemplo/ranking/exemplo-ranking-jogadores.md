# 🎮 Exercício em Sala — Sistema de Ranking

## Contexto

Uma plataforma de jogos precisa de um sistema simples para gerenciar o ranking dos **5 melhores jogadores**. Cada jogador tem um nome e uma pontuação. O sistema deve ser construído usando orientação a objetos e oferecer um menu interativo.

---

## Estrutura do programa

### Classe `Jogador`

Crie uma classe `Jogador` com:

- **Atributos:** `nome` (String) e `pontuacao` (int)
- **Construtor** que receba o nome e a pontuação
- **Método `eDestaque()`** — retorna `true` se a pontuação for **>= 1000**, `false` caso contrário
- **Método `exibir(int posicao)`** — imprime a posição, o nome e a pontuação. Se `eDestaque()` retornar `true`, exibe `*` ao lado

### Classe `Ranking`

Crie uma classe `Ranking` com:

- **Atributo:** `jogadores` (vetor de `Jogador` com tamanho 5)
- **Construtor** que inicialize o vetor
- **Método `registrar(int posicao, String nome, int pontuacao)`** — se a posição for inválida (fora de 1 a 5), exiba `"Posição inválida!"`. Se for válida, crie um novo `Jogador` e armazene na posição correspondente do vetor. Use `if/else` para a validação
- **Método `exibirRanking()`** — percorra o vetor com `for`. Para cada posição, se o jogador existir (não for `null`), chame o método `exibir()` do jogador. Se for `null`, exiba `"-- vazio --"`

### Classe `Main`

No `main`:

1. Crie um objeto `Ranking`

2. Exiba um menu com as opções (use `switch`):
   - `1 — Registrar jogador`
   - `2 — Exibir ranking`
   - `0 — Sair`

3. No `default`, exiba `"Opção inválida!"`

4. O menu deve repetir até o usuário digitar `0` (use `while`)

---

## Conceitos exercitados

| Conceito | Onde aparece |
|----------|-------------|
| `classe` | `Jogador` e `Ranking` |
| `construtor` | Inicialização dos objetos |
| `método com retorno` | `eDestaque()` retorna boolean |
| `método void` | `exibir()`, `registrar()`, `exibirRanking()` |
| `vetor de objetos` | `Jogador[]` dentro de `Ranking` |
| `if/else` | Validação da posição + verificação de destaque + null check |
| `switch` | Menu de opções (1, 2, 0, default) |
| `for` | Percorrer o vetor no `exibirRanking()` |
| `while` | Loop do menu até digitar 0 |

---

## Exemplo de saída esperada

```
=== MENU ===
1 - Registrar jogador
2 - Exibir ranking
0 - Sair
Opção: 1
Posição (1-5): 2
Nome: Luna
Pontuação: 1500
Registrado!

Opção: 1
Posição (1-5): 4
Nome: Rex
Pontuação: 800
Registrado!

Opção: 1
Posição (1-5): 7
Posição inválida!

Opção: 2
=== RANKING ===
1º: -- vazio --
2º: Luna - 1500 pts *
3º: -- vazio --
4º: Rex - 800 pts
5º: -- vazio --

Opção: 0
Até mais!
```

---

## Dicas

- Lembre que vetores em Java começam no índice `0`, mas para o usuário as posições vão de `1` a `5`. Ajuste na hora de acessar o vetor.
- Antes de chamar métodos de um `Jogador`, verifique se ele não é `null` (posição ainda vazia).

```java
if (jogadores[i] != null) {
    jogadores[i].exibir(i + 1);
} else {
    System.out.println((i + 1) + "º: -- vazio --");
}
```

---