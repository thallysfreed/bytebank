fun lacoFor() {
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