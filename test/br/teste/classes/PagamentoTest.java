/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.teste.classes;

import br.calebe.exemplos.ex01.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.jmock.*;

/**
 *
 * @author Felipe
 */
public class PagamentoTest {
    
    @Test
    public void TestaPagamento(){
        Carrinho carrinho = new Carrinho();
        Produto produto = new Produto("Celular", 800.00);
        carrinho.add(produto);
        final Mockery mockery = new Mockery();
        final SistemaDeCartaoDeCredito cartao = mockery.mock(SistemaDeCartaoDeCredito.class);
        double saldo; 
        saldo = carrinho.ValorCarrinho();
        boolean test;
        test = carrinho.PagarCarrinho(cartao, saldo);
        assertTrue(test);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
