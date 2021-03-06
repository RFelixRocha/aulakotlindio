package com.example.aulakotlindio.filialbanco

import com.example.aulakotlindio.Funcionario

class ImprimirRelatorioFuncionario {
    companion object{
        fun mostrarRelatorio(funcionario: Funcionario) = println(funcionario.toString())
    }
}