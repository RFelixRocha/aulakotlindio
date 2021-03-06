package com.example.aulakotlindio

class Pessoa {
    var nome : String = "Raimundo felix"
    var cpf : String = "000.000.000-31"
}

fun main(){
    var pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
}