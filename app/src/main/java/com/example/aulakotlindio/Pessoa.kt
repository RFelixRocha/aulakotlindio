package com.example.aulakotlindio

class Pessoa {
    var nome : String = "Raimundo Felix"
    var cpf : String = "000.000.000-00"
}

fun main(){
    var pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)

}