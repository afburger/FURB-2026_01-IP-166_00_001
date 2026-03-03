programa {

  real saldo = 0

  funcao sacar() {
    real saque
    escreva("Informe o valor do saque:")
    leia(saque)

    se(saldo > saque) {
      saldo = saldo - saque
    } senao {
      escreva("Saldo insuficiente")
    }
  }

  funcao depositar() {
    real deposito
    escreva("Informe o valor do depósito:")
    leia(deposito)

    saldo = saldo + deposito
  }

  funcao inicio() {
    
    inteiro numeroConta
    escreva("Digite o número da conta")
    leia(numeroConta)

    depositar()
    sacar()

    escreva("\n O Saldo atual da conta "+ numeroConta +" é: " + saldo)
  }
}
