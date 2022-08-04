package br.com.alura.situacao;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }

    @Override
    public void atualizaEstadoParecer(Orcamento orcamento) {
        orcamento.setEstadoParecer("Reprovado");
    }
}
