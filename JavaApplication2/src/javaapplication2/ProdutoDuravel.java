/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author matheusrangel
 */
public class ProdutoDuravel extends Produto{
    private String meterialPredominante, durabilidade; 

    public String getMeterialPredominante() {
        return meterialPredominante;
    }

    public void setMeterialPredominante(String meterialPredominante) {
        this.meterialPredominante = meterialPredominante;
    }

    public String getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(String durabilidade) {
        this.durabilidade = durabilidade;
    }
    
}
