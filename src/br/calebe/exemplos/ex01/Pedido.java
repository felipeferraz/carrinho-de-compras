/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.calebe.exemplos.ex01;

import java.util.List;

/**
 *
 * @author Felipe
 */
public class Pedido {
    private List<Produto> produtos;
    private Integer codigo;
    private String status;
    private static Integer i = 0;


    public Pedido(Carrinho carrinho){
        this.produtos = carrinho.getProduto();
        this.codigo = i++;
        this.status = "Aguardando Pagamento";
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static Integer getI() {
        return i;
    }

    public static void setI(Integer i) {
        Pedido.i = i;
    }
    
    public String validaPedido(Transportadora X){
        if(X != null) return this.status;
        return "Pedido Não Encontrado";
    }
}
