fun main() {
    //testes()
    val func = Funcionario(
        "Teste funcionário",
        "12345678900",
        1000.0
    )

    println("Nome: ${func.nome}")
    println("Salário: ${func.salario}")
    println("Cpf: ${func.cpf}")
    println("Bonificação: ${func.bonificacao()}")
}


