programa {
  funcao inicio() {
    
    cadeia modelo
    inteiro tanque
    inteiro quilometragem

    escreva("Informe o modelo do veículo: ")
    leia(modelo)

    escreva("\nInforme a capacidade do tanque: ")
    leia(tanque)

    escreva("\nInforme a quilometragem rodada: ")
    leia(quilometragem)

    real media = quilometragem / tanque
    escreva("\nA média do veículo foi de : " + media + "km/L")
    
  }
}
