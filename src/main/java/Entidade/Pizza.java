/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author mayar
 */
public class Pizza {
    private String sabor, descricao, tamanho;
    private double preco;
    
    public Pizza() {
      
    }
 public Pizza(String sabor, String descricao, String tamanho, double preco){
    this.sabor = sabor;
    this.descricao = descricao;
    this.tamanho = tamanho;
    this.preco = preco;
}

    

    public String getSabor() {
        return sabor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
