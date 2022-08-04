package br.com.alura.situacao;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {
    @Override
    public void atualizaEstadoParecer(Orcamento orcamento) {
        orcamento.setEstadoParecer("Finalizado");
    }
}
