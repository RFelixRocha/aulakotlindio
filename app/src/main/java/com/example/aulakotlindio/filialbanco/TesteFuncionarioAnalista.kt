package com.example.aulakotlindio.filialbanco

import com.example.aulakotlindio.Funcionario
import com.example.aulakotlindio.Pessoa
import java.math.BigDecimal

fun main(){

    var analista = Analista("Felix","47920472",450.0)

    println(mostrarRelatorio(analista))

}

fun mostrarRelatorio(funcionario: Funcionario) = println(funcionario.toString())