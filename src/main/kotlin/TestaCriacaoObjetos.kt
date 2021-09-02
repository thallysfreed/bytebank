fun testaCriacaoObjetos() {
    val conta = Conta("Thallys", 5000)

    conta.deposita(500.0)

    val contaTeste = Conta("Teste", 500001)
    contaTeste.deposita(1000.0)

    println(contaTeste.titular)
    println(contaTeste.saldo)
    println(contaTeste.numero)

    println(conta.titular)
    println(conta.saldo)
    println(conta.numero)
}