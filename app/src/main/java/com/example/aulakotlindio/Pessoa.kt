package com.example.aulakotlindio

class Pessoa {
    var nome : String = "Raimundo Felix"
    var cpf : String = "000.000.000-00"

    inner class Endereco{
        var rua: String = "Rua A"
    }
}

fun main(){
    var pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)

    println(pessoa.Endereco().rua)
}