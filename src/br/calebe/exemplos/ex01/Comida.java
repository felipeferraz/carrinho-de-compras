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
public class Comida extends Produto{
    
            private boolean perecivel ;
            private double peso; //A validade é em meses a partir do momento da abertura
    
            public Comida(String nome, double preco, boolean perecivel , double peso) {
               super(nome, preco);
               this.perecivel = perecivel;
               this.peso = peso;
            }
    
}
