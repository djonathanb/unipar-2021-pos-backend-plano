package br.unipar.plano.procedimento

import java.time.LocalDateTime

class Exame(
    codigo: Long,
    nome: String,
    horario: LocalDateTime = LocalDateTime.now()
) : Procedimento(codigo, nome, horario)