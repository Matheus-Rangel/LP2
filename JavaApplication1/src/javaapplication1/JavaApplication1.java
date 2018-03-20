/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author matheusrangel
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfessorRegime professor1 = new ProfessorRegime();
        ProfessorHorista professor2 = new ProfessorHorista();
        professor1.setNome("Roberto");
        professor1.setIdade(35);
        professor1.setMatricula("201501");
        professor1.setSalario(3500);
        professor2.setNome("Felipe");
        professor2.setMatricula("201502");
        professor2.setIdade(26);
        professor2.setSalario_hora("50.99");
        professor2.setTotal_horas(40);
        System.out.println(professor1.getNome() + ", " + professor1.getMatricula()+ ", " + professor1.getIdade() + ", " + professor1.getSalario());
        System.out.println(professor2.getNome() + ", " + professor2.getMatricula()+ ", " + professor2.getIdade() + ", " + professor2.Salario());
    }
    
}
