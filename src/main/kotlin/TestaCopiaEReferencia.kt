fun testaCopiaEReferencia() {
    var numero1 = 10;
    var numero2 = numero1

    numero2++

    println(numero1)
    println(numero2)

    val conta1 = Conta("conta1", 1)
    val conta2 = Conta("conta2", 2)

    println(conta1.titular)
    println(conta2.titular)
}