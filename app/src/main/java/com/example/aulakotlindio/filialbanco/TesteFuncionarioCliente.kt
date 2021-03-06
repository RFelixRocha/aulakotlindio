package com.example.aulakotlindio.filialbanco

import com.example.aulakotlindio.Cliente
import com.example.aulakotlindio.ClienteTipo
import com.example.aulakotlindio.Gerente

fun main(){

    var cliente = Cliente("João da Silva","000080808",ClienteTipo.PF,"112233")

    println(cliente)

    TesteAutenticacao().autentica(cliente)
}
