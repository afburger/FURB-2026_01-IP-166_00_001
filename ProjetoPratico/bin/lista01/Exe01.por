programa {
  funcao inicio() {
    inteiro numero1
    inteiro numero2

    escreva("Digite o primeiro número")
    leia(numero1)

    escreva("Digite o segundo número")
    leia(numero2)

    inteiro soma = numero1 + numero2
    escreva("O resultado da soma é: " + soma)

    inteiro subtracao = numero1 - numero2
    escreva("\n O resultado da subtraao é: " + subtracao)

    inteiro multiplicacao = numero1 * numero2
    escreva("\n O resultado da multiplicação é: " + multiplicacao)

    se(numero2 > 0) {
      inteiro divisao = numero1 / numero2
      escreva("\n O resultado da divisão é: " + divisao)
    } senao {
      escreva("\n Não é possível dividir por zero")
    }
  }
}
