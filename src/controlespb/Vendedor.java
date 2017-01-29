/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlespb;

/**
 *
 * @author Douglas N. BK
 */
public class Vendedor {
    
private String nome;
private String endereco;
private String telefone;
private double valor;
private double volta;
private double TotalVolta;

    public Vendedor() {
    }

    public Vendedor(String nome, String endereco, String telefone, double valor) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.valor = valor;
    }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the volta
     */
    public double getVolta() {
        return volta;
    }

    /**
     * @param volta the volta to set
     */
    public void setVolta(double volta) {
        this.volta = volta;
    }
    
    public void setTotalVolta(double volta){
        this.volta = volta;
    }
   
    public double getTotalVolta(){
        return volta;
    }
}
