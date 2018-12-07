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
public class Refrigerante {
    private String marca, tamanho;
    private double preco;
    
 public Refrigerante() {
       
    }
    public Refrigerante(String marca, String tamanho, double preco){
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
    }
    public String getMarca() {
        return marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    

}
