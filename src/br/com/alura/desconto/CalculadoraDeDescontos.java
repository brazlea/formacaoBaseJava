package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        // Nesse ponto ele instancia a classe que será executada
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto())
        );

        // Nesse ponto ele executa.
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
