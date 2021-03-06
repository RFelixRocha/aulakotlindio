package com.example.aulakotlindio.filialbanco

import com.example.aulakotlindio.Funcionario
import com.example.aulakotlindio.Pessoa
import java.math.BigDecimal

fun main(){

    var pessoa = Pessoa("Felix","47920472")

    println(pessoa.nome)
    println(pessoa.cpf)
    println("===========")

    var funcionario = Funcionario("Fernando Junior","73497453", BigDecimal.valueOf(4456))

    println(funcionario.nome)
    println(funcionario.cpf)
    println(funcionario.salario)
}