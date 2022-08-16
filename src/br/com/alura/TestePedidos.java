package br.com.alura;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.pedido.GeraPedido;
import br.com.alura.pedido.GeraPedidoHandler;
import br.com.alura.pedido.Pedido;
import br.com.alura.pedido.acao.EnviarEmailPedido;
import br.com.alura.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestePedidos {

    public static void main(String[] args) {

        String cliente = "Leandro";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new EnviarEmailPedido(), new SalvarPedidoNoBancoDeDados())
        );
        handler.executa(gerador);

    }

}
