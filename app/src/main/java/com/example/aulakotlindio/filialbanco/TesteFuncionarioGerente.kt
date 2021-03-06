package com.example.aulakotlindio.filialbanco

import com.example.aulakotlindio.Analista
import com.example.aulakotlindio.Funcionario

fun main(){

    var analista = Analista("Felix","47920472",450.0)

    println(mostrarRelatorio(analista))

}

fun mostrarRelatorio(funcionario: Funcionario) = println(funcionario.toString())