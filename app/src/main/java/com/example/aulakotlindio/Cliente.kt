package com.example.aulakotlindio

class Cliente(nome: String, cpf: String, val clienteTipo: ClienteTipo, val senha: String) : Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = "1132233" == senha

    override fun toString(): String = """
        Nome:     $nome
        Cpf:      $cpf
        Tipo:     ${clienteTipo.descricao}
    """.trimIndent()
}