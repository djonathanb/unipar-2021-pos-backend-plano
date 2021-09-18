package br.unipar.plano.procedimento

import java.time.LocalDateTime

abstract class Procedimento(
    val codigo: Long,
    val nome: String,
    var horario: LocalDateTime = LocalDateTime.now()
) {

    private var status: Status = Status.PENDENTE

    fun esta(status: Status) = this.status == status

    fun cancelar() {
        status = Status.CANCELADO
    }

    fun finalizar() {
        status = Status.FINALIZADO
    }

}