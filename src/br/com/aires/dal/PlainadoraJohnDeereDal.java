/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aires.dal;

import br.com.aires.model.Loteamento;

/**
 *
 * 
 */
public class PlainadoraJohnDeereDal {

    private final double precoDoMetroPlainado = 40;
    private double total;

    public PlainadoraJohnDeereDal() {
    }

    public PlainadoraJohnDeereDal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        String saida = " ***** Plainadora John Deere *****\n"
                + "Preco Do Metro Plainado = " + String.format("%.2f", precoDoMetroPlainado)
                + "\n---------------------------\n";
        return saida;
    }

    public String terraplainarComJohnDeere(Loteamento loteamento) {

        total = this.precoDoMetroPlainado * loteamento.getMetrosQuadrados();

        String calculo = "Área do Loteamento: " + loteamento.getMetrosQuadrados() + " Metros Quadrados\n"
                + "Valor do Metro Plainado: " + String.format("%.2f", this.precoDoMetroPlainado) + "\n"
                + "Total: " + String.format("%.2f", total);

        return calculo;
    }

}
