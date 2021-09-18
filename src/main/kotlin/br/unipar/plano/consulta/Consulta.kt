package br.unipar.plano.consulta

import java.time.LocalDateTime

class Consulta {

    private var codigo: Long
    private var prestador: String
    private var horario: LocalDateTime
    private var status: Status
    private var finalizacao: Finalizacao?

    constructor(codigo: Long, prestador: String, horarioAgendamento: LocalDateTime) {
        this.codigo = codigo
        this.prestador = prestador
        this.horario = horarioAgendamento
        this.status = Status.REQUISITADA
        this.finalizacao = null
    }

    fun finalizar(usuario: String) {
        this.status = Status.FINALIZADA
        this.finalizacao = Finalizacao(usuario)
    }

    fun esta(status: Status) = this.status == status

    override fun toString() = "{ " +
            "codigo: $codigo, " +
            "prestador: $prestador, " +
            "horario: $horario, " +
            "finalizacao: $finalizacao, " +
            "status: $status " +
            "}"

}