/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author matheusrangel
 */
public class ProfessorHorista extends Professor{
    private String salario_hora;
    private int  total_horas;

    public double Salario(){
        return Double.parseDouble(salario_hora) * this.total_horas;
    }
    public String getSalario_hora() {
        return salario_hora;
    }

    public void setSalario_hora(String salario_hora1) {
        salario_hora = salario_hora1;
    }

    public int getTotal_horas() {
        return total_horas;
    }

    public void setTotal_horas(int total_horas) {
        this.total_horas = total_horas;
    }
    
}
