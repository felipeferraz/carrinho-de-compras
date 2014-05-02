/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.calebe.exemplos.ex01;

/**
 *
 * @author Felipe
 */

public class CartaoDeCredito implements SistemaDeCartaoDeCredito {
    
    protected Integer number;
    protected String senha;
    protected Double Limite;
    protected Double Total;
    private static int i;

    public void CartaoDeCredito(){
        this.number = i+1;
        this.senha = "123456";
        this.Limite = 1000.00;
        this.Total = 0.00;
    }
    public boolean EfetuarPagamento(double saldo) {
    
        if(saldo < (this.Limite - this.Total)){
            this.Total = this.Total + saldo;
            return true;
        }
        return false;
    }
    public void imprimir(){
        System.out.println(this.Limite);
        System.out.println(this.Total);
        System.out.println(this.number);
        System.out.println(this.senha);
    }

    
    
    
    
}
