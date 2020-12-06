/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4_Vetor;

import java.util.Scanner;

/**
 *
 * @author watlas
 */

//Nesse programa eu pego o numero que o usuario digitou e localizo no vetor e somo os dois.
public class VetorPegandoNumero {

    public static void main(String[] args) {
        float valores[] = new float[15];
        float x, y;
        boolean teste1 = false;
        boolean teste2 = false;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite a posicao " + (i + 1) + "º Valor:");
            valores[i] = ler.nextFloat();
        }

        System.out.println("Agora digite o primeiro valor do vetor que deseja fazer a soma:");
        x = ler.nextFloat();
        do {
            for (int i = 0; i < valores.length - 1; i++) {
                if (x == valores[i]) {
                    teste1 = true;
                }
            }
            if (teste1 == false) {
                System.out.println("Posições inválidas, digite o valor novamente:");
                System.out.print("> ");
                x = ler.nextFloat();
            }
        } while (teste1 == false);

        System.out.println("Agora digite o segundo valor do vetor que deseja fazer a soma:");
        y = ler.nextFloat();
        do {

            for (int i = 0; i < valores.length - 1; i++) {
                if (y == valores[i]) {
                    teste2 = true;
                }
            }
           if(teste2 == false){
            System.out.println("Posições inválidas, digite o valor novamente:");
            y = ler.nextFloat();
           }
        } while (teste2 == false);
        
        System.out.println("\n VALOR DA SOMA: "+ y + x);

    }

}
