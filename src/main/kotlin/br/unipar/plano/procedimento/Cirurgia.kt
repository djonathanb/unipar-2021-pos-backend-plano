package br.unipar.plano.procedimento

import java.time.LocalDateTime

class Cirurgia(
    codigo: Long,
    nome: String,
    horario: LocalDateTime = LocalDateTime.now(),
    private val medico: String
) : Procedimento(codigo, nome, horario) {

    fun reagendar(novoHorario: LocalDateTime) {
        if (novoHorario.minusDays(3).isBefore(this.horario)) {
            throw IllegalArgumentException("Novo horário deve ser no mínimo três dias posterior ao atual")
        }
        this.horario = novoHorario
    }

}
