/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5_Metodo;

/**
 *
 * @author watlas
 */
public class Calculo {

    public static double calcularSalario(String tipoFuncionario) {

        switch (tipoFuncionario) {
            case "fullstack1":
                return 2500.00;
            case "fullstack2":
                return 4500.00;
            case "fullstack3":
                return 6500.00;
            case "gerente":
                return 12000.00;
        }

        throw new RuntimeException("Não existe esse cargo");
    }
    public static void main(String[] args) {
        System.out.println(calcularSalario("ge"));
    }

}
