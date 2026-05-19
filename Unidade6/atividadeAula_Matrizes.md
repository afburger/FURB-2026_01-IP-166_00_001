# Lista de Exercícios - Unidade 7 - Tipos Estruturados Bidimensionais (Matrizes)

Implemente  uma  classe  com  o  método  main  para  cada  um  dos seguintes  exercícios utilizando o VSCode. Faça a análise do problema identificando as entradas, saídas e testes. Utilize  somente  os  comandos  que  você  aprendeu  na  disciplina  até  o  momento  para  a resolução das atividades.

Utilize o nome do arquivo Java e da Classe de acordo com o indicado no inicio de cada enunciado.

Dica geral: quando o enunciado pede "um método para ler" e "outro para escrever", por exemplo, isso pode ser tão simples quanto separar cada for em um método próprio. A ideia é começar a organizar o código em blocos de responsabilidade — cada método faz uma coisa.

----------

## Matrizes de Tamanho definido no código

----------

**Uni7Exe01.java** - Descreva um algoritmo que leia valores inteiros para preencher uma matriz 4x4. Em seguida, escreva os valores da diagonal principal e a soma desses valores. Faça um método para ler a matriz, outro para identificar e escrever a diagonal principal e outro para calcular e retornar a soma da diagonal.

----------
**Uni7Exe02.java** - Descreva um algoritmo que leia valores reais para preencher uma matriz 3x5 (3 linhas e 5 colunas). Essa matriz representa as notas de 3 alunos em 5 provas. O programa deve calcular e exibir a média de cada aluno (média de cada linha) e a média de cada prova (média de cada coluna). Faça um método para ler a matriz, outro para calcular e exibir as médias dos alunos e outro para calcular e exibir as médias das provas.

----------
**Uni7Exe03.java** - Descreva um algoritmo que leia valores inteiros para preencher duas matrizes 3x3. Crie uma terceira matriz 3x3 que seja o resultado da multiplicação das duas matrizes lidas. Exiba as três matrizes na tela. Faça um método para ler uma matriz, outro para multiplicar as duas matrizes e outro para exibir uma matriz.

Lembre-se: na multiplicação de matrizes, cada elemento da matriz resultado é calculado pela soma dos produtos dos elementos da linha da primeira matriz pelos elementos da coluna correspondente da segunda matriz.

----------

## Matrizes de Tamanho informado

----------
**Uni7Exe04.java** - Uma empresa tem um quadro de funcionários organizado em departamentos. Faça um programa que leia o número de departamentos (linhas) e o número de funcionários por departamento (colunas), limitados a no máximo 10 departamentos e 20 funcionários por departamento. Em seguida, leia o salário de cada funcionário para preencher a matriz. O programa deve informar:

- o maior salário de toda a empresa e em qual departamento/posição ele se encontra;
- a média salarial de cada departamento;
- quantos funcionários ganham acima da média geral da empresa.

Crie um método para ler a matriz, um para encontrar o maior salário, um para calcular e exibir a média de cada departamento e um para contar os funcionários acima da média geral.

----------
**Uni7Exe05.java** - Faça um programa que simule um jogo da velha (tic-tac-toe) usando uma matriz 3x3 de caracteres. O programa deve funcionar com um menu que se repete até alguém vencer, dar velha (empate) ou os jogadores escolherem sair:

- "1 – Jogar": o jogador da vez informa a linha e a coluna onde deseja marcar (X ou O). Se a posição já estiver ocupada, peça outra. Alterne entre os jogadores a cada rodada;
- "2 – Exibir tabuleiro": mostra o estado atual do tabuleiro formatado;
- "3 – Sair": encerra o programa.

Após cada jogada, verifique se houve vencedor (três marcações iguais na mesma linha, coluna ou diagonal) ou se o tabuleiro encheu (velha). Faça um método para exibir o tabuleiro, outro para registrar a jogada, outro para verificar se houve vencedor e outro para verificar se deu velha.

**Desafio:** ao final da partida, pergunte se os jogadores querem jogar novamente e reinicie o tabuleiro sem encerrar o programa.

----------
