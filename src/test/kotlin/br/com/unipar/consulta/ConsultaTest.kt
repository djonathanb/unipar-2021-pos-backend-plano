package br.com.unipar.consulta

import br.unipar.plano.consulta.Consulta
import br.unipar.plano.consulta.Status
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class ConsultaTest {

    @Test
    fun `deve ser criada com o status REQUISITADA`() {
        val consulta = Consulta(1, "Mauro", LocalDateTime.now())
        assertTrue(consulta.esta(Status.REQUISITADA))
    }

    @Test
    fun `deve permitir a finalizacao de uma consulta`() {
        val consulta = Consulta(1, "Mauro", LocalDateTime.now())
        consulta.finalizar("superusuario@unipar.br")
        assertTrue(consulta.esta(Status.FINALIZADA))
    }

}