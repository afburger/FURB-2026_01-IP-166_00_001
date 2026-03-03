programa {
  funcao inicio() {
    
    inteiro numeroConta
    real saldo = 0

    real deposito
    escreva("Informe o valor do depósito:")
    leia(deposito)

    saldo = saldo + deposito

    real saque
    escreva("Informe o valor do saque:")
    leia(saque)

    se(saldo > saque) {
      saldo = saldo - saque
    } senao {
      escreva("Saldo insuficiente")
    }


    escreva("\n O Saldo atual da conta é: " + saldo)
  }
}
