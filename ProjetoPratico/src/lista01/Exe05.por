programa {
  funcao inicio() {
    
    cadeia nome
    real preco
    inteiro estoque

    escreva("Informe o nome do produto: ")
    leia(nome)

    escreva("\nInforme o preço do produto: ")
    leia(preco)

    escreva("\nInforme a quantidade em estoque: ")
    leia(estoque)

    inteiro adicionar
    escreva("\nInforme a quantidade que deseja adicionar em estoque: ")
    leia(adicionar)
    estoque = estoque + adicionar

    inteiro remover
    escreva("\nInforme a quantidade que deseja remover do estoque: ")
    leia(remover)
    estoque = estoque - remover

    real valorTotalEstoque = estoque * preco
    escreva("\n O valor total em estoque é: " + valorTotalEstoque)
  }
}
