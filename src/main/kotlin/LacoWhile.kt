fun lacoWhile() {
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