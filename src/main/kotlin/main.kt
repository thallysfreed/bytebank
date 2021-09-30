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


    val asus = Gerente(
        nome = "Asus",
        cpf = "505050505050",
        salario = 1000.0,
        senha = 1234
    )
    println("nome ${asus.nome}")
    println("cpf ${asus.cpf}")
    println("salario ${asus.salario}")
    println("bonificação ${asus.bonificacao()}")
    if(asus.autentica(1234)){
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

    val intel = Diretor(
        nome = "Intel",
        cpf = "555555555555",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${intel.nome}")
    println("cpf ${intel.cpf}")
    println("salario ${intel.salario}")
    println("bonificação ${intel.bonificacao()}")
    println("plr ${intel.plr}")

    if(asus.autentica(1234)){
        println("Autenticado com sucesso")
    }else{
        println("Falha ao autenticar")
    }

}


