open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open val bonificacao: Double
        get() {
            return salario * 0.1
        }

//    fun autentica(senha: Int) {
//        if (tipo == 1) {
//            // pode autenticar
//        }
//    }
}