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
public class VetorPegandoPosicao {

    public static void main(String[] args) {
        float valores[] = new float[15];
        int x=0, y=0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o valor da posicao " + i + "º Valor:");
            valores[i] = ler.nextFloat();
        }

        System.out.println("Agora digite o primeiro valor do vetor que deseja fazer a soma:");
        x = ler.nextInt();
        while (x < 1 || x > 15) {
            System.out.println("Posições inválidas, digite o valor novamente:");
            System.out.print("> ");
            x = ler.nextInt();
        }

        System.out.println("Agora digite o segundo valor do vetor que deseja fazer a soma:");
        y = ler.nextInt();
        while (y < 1 || y > 15) {

            System.out.println("Posições inválidas, digite o valor novamente:");
            y = ler.nextInt();

        }
       
        System.out.println("\n VALOR DA SOMA: " +  (valores[y] + valores[x]));

    }
}
