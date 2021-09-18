package br.com.unipar.procedimento

import br.unipar.plano.procedimento.Cirurgia
import br.unipar.plano.procedimento.Exame
import br.unipar.plano.procedimento.ServicoCancelamento
import br.unipar.plano.procedimento.Status
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ServicoCancelamentoTest {

    @Test
    fun `permite o cancelamento de um exame`() {
        val servicoCancelamento = ServicoCancelamento()
        val procedimento = servicoCancelamento.cancelarProcedimento(1L)
        assertTrue(procedimento is Exame)
        assertTrue(procedimento.esta(Status.CANCELADO))
    }

    @Test
    fun `permite o cancelamento de uma cirurgia`() {
        val servicoCancelamento = ServicoCancelamento()
        val procedimento = servicoCancelamento.cancelarProcedimento(4L)
        assertTrue(procedimento is Cirurgia)
        assertTrue(procedimento.esta(Status.CANCELADO))
    }

}