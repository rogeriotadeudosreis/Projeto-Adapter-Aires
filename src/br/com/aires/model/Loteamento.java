/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aires.model;

/**
 *
 *
 */
public class Loteamento {

    private String nome;
    private String bairro;
    private int metrosQuadrados;

    public Loteamento() {
    }

    public Loteamento(String nome, String bairro, int metrosQuadrados) {
        this.nome = nome;
        this.bairro = bairro;
        this.metrosQuadrados = metrosQuadrados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(int metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    @Override
    public String toString() {
        return " ******* Dados do Loteamento *******\n"
                + "Nome = " + nome.toUpperCase()
                + "\nBairro = " + bairro.toUpperCase()
                + "\nTamanho = " + metrosQuadrados + " Metros Quadrados\n"
                + "-------------------------------------\n";
    }

}
