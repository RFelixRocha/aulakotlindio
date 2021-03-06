package com.example.aulakotlindio.filialbanco

import com.example.aulakotlindio.Funcionario

class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome,cpf,salario) {
    override fun calculoAuxilio() = salario*0.1
}