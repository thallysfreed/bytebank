fun testes(){
    println("Bem vindo ao Bytebank")
    lacoWhile()
    lacoFor()
    testaCriacaoObjetos()
    testaCopiaEReferencia()

    val conta = Conta("Thallys", 5000)
    conta.deposita(1000.0)

    val contaTeste = Conta("Informal", 5001)
    conta.deposita(1000.0)

    println("Saldo da conta do ${conta.titular} é de R$ ${conta.saldo}")
    conta.deposita(500.0)
    println("Saldo da conta do ${conta.titular} é de R$ ${conta.saldo}")

    println("Saldo da conta do ${conta.titular} é de R$ ${conta.saldo}")
    conta.saca(500.0)
    println("Saldo da conta do ${conta.titular} é de R$ ${conta.saldo}")

    println("Saldo da conta do ${conta.titular} é de R$ ${conta.saldo}")
    conta.saca(1500.0)
    println("Saldo da conta do ${conta.titular} é de R$ ${conta.saldo}")

    println("Saldo da conta do ${contaTeste.titular} é de R$ ${contaTeste.saldo}")

    if (conta.transfere(50.0, contaTeste)) {
        println()
    } else {
        println()
    }

    println("Saldo da conta do ${contaTeste.titular} é de R$ ${contaTeste.saldo}")
}