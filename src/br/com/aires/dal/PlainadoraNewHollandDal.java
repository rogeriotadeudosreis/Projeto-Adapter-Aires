/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aires.dal;

import br.com.aires.interfaces.Interface_Terraplanagem;
import br.com.aires.model.Loteamento;

/**
 *
 *
 */
public class PlainadoraNewHollandDal implements Interface_Terraplanagem {

    private final double precoDoMetroPlainado = 50;
    private double total;

    public PlainadoraNewHollandDal() {
    }

    public double getPrecoDoMetroPlainado() {
        return precoDoMetroPlainado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        String saida = " ***** Plainadora New Holland *****\n"
                + "Preco Do Metro Plainado = " + String.format("%.2f", precoDoMetroPlainado)
                + "\n--------------------------------------\n";
        return saida;
    }

    @Override
    public String terraplainarComNewHolland(Loteamento loteamento) {

        total = this.precoDoMetroPlainado * loteamento.getMetrosQuadrados();
        
        String calculo = "Área do Loteamento: " + loteamento.getMetrosQuadrados() + "\n"
                + "Valor do Metro Plainado: " + String.format("%.2f", this.precoDoMetroPlainado) + "\n"
                + "Total: " + String.format("%.2f", total) + "\n"
                + "---------------------------------------------\n";

        return calculo;
    }

}
