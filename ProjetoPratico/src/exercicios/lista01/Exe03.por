programa {
  funcao inicio() {

    inteiro comprimento
    inteiro largura

    escreva("Digite o comprimento do retangulo: ")
    leia(comprimento)

    escreva("\nDigite a largura do retangulo: ")
    leia(largura)


    inteiro area = comprimento * largura
    inteiro perimetro = 2 * (comprimento + largura)

    escreva("\nA área do retangulo é: " + area)
    escreva("\nO perimetro do retangulo é: " + perimetro)
    
  }
}