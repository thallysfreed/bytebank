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