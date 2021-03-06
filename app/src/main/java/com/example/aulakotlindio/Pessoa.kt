package com.example.aulakotlindio

class Pessoa {
    var nome : String = "Raimundo Felix"
    var cpf : String = "000.000.000-00"

    private set

    fun visualizarNomeCpf() = "Nome: $nome \n CPF: $cpf"
}

fun main(){

    var pessoa = Pessoa()

    println(pessoa.visualizarNomeCpf())

}