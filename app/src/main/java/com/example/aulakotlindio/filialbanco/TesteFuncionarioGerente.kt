package com.example.aulakotlindio.filialbanco

import com.example.aulakotlindio.Gerente

fun main(){

    var gerente = Gerente("Raimundo Felix","47920472",2450.0)

    println(ImprimirRelatorioFuncionario.mostrarRelatorio(gerente))

}
