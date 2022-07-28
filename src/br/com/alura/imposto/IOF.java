package br.com.alura.imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class IOF implements Imposto{
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.15"));
    }
}
