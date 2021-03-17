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
public class PlainadoraDalAdapter implements Interface_Terraplanagem {

    PlainadoraJohnDeereDal objeto = new PlainadoraJohnDeereDal();

    @Override
    public String terraplainarComNewHolland(Loteamento loteamento) {
        
        return objeto.toString() + objeto.terraplainarComJohnDeere(loteamento);
    }

}
