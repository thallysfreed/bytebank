fun main() {
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

class Conta(
    val titular: String,
    var numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valorDeposito: Double) {
        this.saldo += valorDeposito;
    }

    fun saca(valorSaque: Double) {
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
        }
    }

    fun transfere(valorTransferencia: Double, destino: Conta): Boolean {
        if (valorTransferencia <= this.saldo) {
            this.saca(valorTransferencia)
            this.deposita(valorTransferencia)
            return true
        }
        return false
    }
}

private fun testaCriacaoObjetos() {
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

private fun testaCopiaEReferencia() {
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

private fun lacoWhile() {
    var j = 0
    while (j < 5) {
        val titular: String = "Thallys Freed $j"
        val numeroConta: Int = 1000 + 1
        var saldo: Double = 20.0 + j

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        testaCondicoes(saldo)
        println("-------------------------------------")
        j++
    }
}

private fun lacoFor() {
    for (i in 1..5) {
        val titular: String = "Thallys Freed $i"
        val numeroConta: Int = 1000 + 1
        var saldo: Double = 20.0 + i

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        testaCondicoes(saldo)
        println("-------------------------------------")
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> {
            println("conta é positiva")
        }
        saldo == 0.0 -> {
            println("conta é neutra")
        }
        else -> {
            println("conta é negativa")
        }
    }
}

