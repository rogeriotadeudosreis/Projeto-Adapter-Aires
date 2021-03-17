/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aires.dal;

import br.com.aires.interfaces.Interface_Iterator;
import br.com.aires.model.Loteamento;

/**
 *
 * 
 */
public class LoteamentoIterator implements Interface_Iterator {

    Loteamento[] lotes;
    int posicao = 0;

    public LoteamentoIterator(Loteamento[] lotes) {
        this.lotes = lotes;
    }

    @Override
    public boolean hasNext() {
        if (posicao >= lotes.length || lotes[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {

        Loteamento loteamento = lotes[posicao];
        posicao++;
        return loteamento;

    }

}
