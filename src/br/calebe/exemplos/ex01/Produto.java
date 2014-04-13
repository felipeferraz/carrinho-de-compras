package br.calebe.exemplos.ex01;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
        
    public String getNome() {
        return this.nome;
    }
    
    public void trocaPreco(float x){
        this.preco = x;
    }

    @Override
    public boolean equals(Object obj) {
        return equals((Produto) obj);
    }
    
    public boolean existsPreco(float p){
        if(this.preco == p) return true;
        else return false;       
    }
    
    public boolean existsPrecoNegativo(){
        if(this.preco >= 0 ) return false;
        else return true;       
    }
        
    public boolean equals(Produto obj) {
        return nome.equals(obj.nome);
    }
}
