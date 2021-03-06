package com.example.aulakotlindio.filialbanco

import com.example.aulakotlindio.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento -> println("${elemento.name} - ${elemento.descricao}")

    }

    ClienteTipo.values().forEach { println("${it.name} - ${it.descricao}")

    }

    var pf = ClienteTipo.PF

    println(pf.descricao)
}