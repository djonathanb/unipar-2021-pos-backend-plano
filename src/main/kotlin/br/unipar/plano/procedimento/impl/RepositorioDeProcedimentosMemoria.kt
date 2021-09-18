package br.unipar.plano.procedimento.impl

import br.unipar.plano.procedimento.Cirurgia
import br.unipar.plano.procedimento.Exame
import br.unipar.plano.procedimento.Procedimento
import br.unipar.plano.procedimento.RepositorioDeProcedimentos
import java.time.LocalDateTime

class RepositorioDeProcedimentosMemoria : RepositorioDeProcedimentos {

    private val procedimentos: MutableList<Procedimento> = mutableListOf()

    init {
        procedimentos.add(Exame(1, "Raio X"))
        procedimentos.add(Exame(2, "Hemograma Completo", LocalDateTime.now().minusDays(1)))
        procedimentos.add(Exame(
            codigo = 3,
            horario = LocalDateTime.now().minusDays(1),
            nome = "Radiografia"
        ))
        procedimentos.add(Cirurgia(4, "Videolaparoscopia", medico = "João"))
    }

    override fun buscarPorCodigo(codigo: Long): Procedimento {
        return procedimentos.first { procedimento -> procedimento.codigo == codigo }
    }

}