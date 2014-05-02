/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.teste.classes;

import br.calebe.exemplos.ex01.*;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class TestPedido {
    
    @Test
    public void TestarPedido(){
        Carrinho carrinho = new Carrinho();
        Produto produto = new Produto("Celular", 800.00);
        carrinho.add(produto);
        Pedido pedido = new Pedido(carrinho);
        final Mockery mockery = new Mockery();
        final Transportadora pacote = mockery.mock(Transportadora.class);
        String result = pedido.validaPedido(pacote);
        assertEquals("Aguardando Pagamento", result);
        
        
    }
}
