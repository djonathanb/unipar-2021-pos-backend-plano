package br.unipar.plano.procedimento

interface RepositorioDeProcedimentos {
    fun buscarPorCodigo(codigo: Long): Procedimento
}