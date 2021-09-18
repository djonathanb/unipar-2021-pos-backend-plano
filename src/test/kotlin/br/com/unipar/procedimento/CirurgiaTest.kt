package br.com.unipar.procedimento

import br.unipar.plano.procedimento.Cirurgia
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException
import java.time.LocalDateTime

class CirurgiaTest {

    @Test
    fun `deve permitir o reagendamento`() {
        val horarioInicial = LocalDateTime.of(2021, 1, 1, 0, 0, 0)
        val novoHorario = LocalDateTime.of(2021, 1, 5, 0, 0, 0)

        val cirurgia = Cirurgia(1, "Video", horarioInicial, "João")
        cirurgia.reagendar(novoHorario)

        assertEquals(novoHorario, cirurgia.horario)
    }

    @Test
    fun `não deve permitir o reagendamento se em menos de três dias`() {
        val horarioInicial = LocalDateTime.of(2021, 1, 1, 0, 0, 0)
        val novoHorario = LocalDateTime.of(2021, 1, 2, 0, 0, 0)

        val cirurgia = Cirurgia(1, "Video", horarioInicial, "João")

        assertThrows(IllegalArgumentException::class.java) { cirurgia.reagendar(novoHorario) }
    }

}