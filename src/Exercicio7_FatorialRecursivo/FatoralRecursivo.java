/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7_FatorialRecursivo;

import Exercicio6_Fatorial.*;

/**
 *
 * @author watlas
 */
public class FatoralRecursivo {
    private int numero;

    public FatoralRecursivo() {
    }

    public FatoralRecursivo(int numero) {
        
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws Exception {
        if (numero < 0){
            throw new Exception("Não existe fatorial de numero negativo");
        }
        this.numero = numero;
    }
    
    //metodo para calcular o fatorial
    public double calculaFatorial(int n){
        double fatorial =1;
        if(n == 1)
            return 0;
        
        while(n > 1){
            fatorial  = fatorial* n;
            n--;
        }
        return fatorial;
        
        
    }
    
}
