package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando Pedido no Banco De Dados!");
    }

}
