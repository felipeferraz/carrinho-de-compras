/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.teste.classes;

import br.calebe.exemplos.ex01.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class ProdutoTest {
    
    private Produto produto;
    
   
    public void criandoproduto(String x, double y){
        produto = new Produto(x,y);
    }
        
    @Test
    public void testarMudarOPrecoDoProduto(){
        float aux1 = new Float(5.000);
        float aux2 = new Float(10.000);
        Produto p = new Produto("Giully", aux1);
        p.trocaPreco(aux2);
        boolean existe;
        existe = p.existsPreco(aux1);
        assertFalse(existe);
    }
    
        public void testarPrecoNegativo(){
        Produto p = new Produto("Giully", 10.00);
        boolean existe;
        existe = p.existsPrecoNegativo();
        assertFalse(existe);
    }
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
