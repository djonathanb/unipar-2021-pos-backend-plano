package br.unipar.plano.procedimento

import br.unipar.plano.procedimento.impl.RepositorioDeProcedimentosMemoria

class ServicoCancelamento {

    private val repositorio: RepositorioDeProcedimentos = RepositorioDeProcedimentosMemoria()

    fun cancelarProcedimento(codigo: Long): Procedimento {
        val procedimento = repositorio.buscarPorCodigo(codigo)
        procedimento.cancelar()
        return procedimento
    }

}