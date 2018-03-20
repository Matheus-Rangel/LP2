/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.*;

/**
 *
 * @author matheusrangel
 */
public class Deposito {
    private Collection<Produto> deposito;

    public Deposito() {
        this.deposito = new ArrayList<Produto>();
    }
    public void adicionarProduto(Produto p){
        deposito.add(p);
    }
}
