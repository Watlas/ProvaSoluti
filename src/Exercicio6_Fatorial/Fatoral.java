/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6_Fatorial;

/**
 *
 * @author watlas
 */
public class Fatoral {
    private int numero;

    public Fatoral() {
    }

    public Fatoral(int numero) {
        
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
    public double calculaFatorialRecursivo(int n){
   
        if(n == 0)
            return 1;
       
        return n * calculaFatorialRecursivo(n - 1);
        
        
    }
    
}
