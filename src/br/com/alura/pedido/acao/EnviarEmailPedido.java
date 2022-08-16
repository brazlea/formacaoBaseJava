package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando Email com dados do Pedido");
    }

}
