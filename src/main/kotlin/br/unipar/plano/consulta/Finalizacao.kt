package br.unipar.plano.consulta

import java.time.LocalDateTime

class Finalizacao(private val usuario: String) {

    private val horario: LocalDateTime

    init {
        this.horario = LocalDateTime.now()
    }

    override fun toString(): String {
        return "{ horario: $horario, usuario: $usuario }"
    }

}