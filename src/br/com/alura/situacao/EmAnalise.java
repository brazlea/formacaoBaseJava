package br.com.alura.situacao;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){

        return orcamento.getValor().multiply(new BigDecimal("0.05"));

    }

    public void Aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void Reprovado(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }

    @Override
    public void atualizaEstadoParecer(Orcamento orcamento) {
        orcamento.setEstadoParecer("Em Analise");
    }
}
