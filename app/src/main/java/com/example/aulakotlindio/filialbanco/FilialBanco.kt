package com.example.aulakotlindio.filialbanco

import com.example.aulakotlindio.Banco

fun main(){
    val digBanco = Banco( numero=1,nome="Brasil")

    println(digBanco.numero)
    println(digBanco.nome)

    val digBanco2 = digBanco.copy(nome="Bradesco")

    println(digBanco2.info())
}