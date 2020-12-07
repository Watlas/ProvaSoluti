/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio12_Matriz;

import java.util.Scanner;

/**
 *
 * @author watlas
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String matrizNome[] = new String[]{"Canceres", "BBugres ", "Cuiabá  ", "VGrande ", "Tangará ", "PLacerda"};
        int matriz[][] = new int[6][6];
        //Metodo de preenchemnto da matriz
        matriz = preencheMatriz();
        //Metodo para imprimir a matriz
        imprimeMatriz(matriz, matrizNome);

        System.out.println("\n");
        
        
        //pegando a primeira cidade
        exibirMenu();
        System.out.println("DIGITE O Nº DA CIDADE DE ORIGEM");
        System.out.print("> ");
        int opcao = ler.nextInt();
        while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 0) {
              System.out.println("Somente numeros de 0 a 5");
            opcao = ler.nextInt();
        }

        System.out.println();
        //pegando a segunda cidade
        exibirMenu();
        System.out.println("DIGITE O Nº DA CIDADE DE DESTINO");
        System.out.print("> ");
        int opcao2 = ler.nextInt();
         while (opcao2 != 1 && opcao2 != 2 && opcao2 != 3 && opcao2 != 4 && opcao2 != 5 && opcao2 != 6) {
              System.out.println("Somente numeros de 0 a 5");
              opcao2 = ler.nextInt();
        }
        System.out.println();
        
        //pegando resposta 
        int resposta = matriz[opcao][opcao2];
        //variaveis auxiliares 
        int j = 0, x = 0;

        if (resposta == -1) {
            System.out.println("NÃO É POSSIVEL SAIR DA CIDADE E "
                    + "IR ATÉ ELA MESMA");
        }
        //caso a resposta seja 0
        
        if (resposta == 0) {
            for (int i = 0; i < 6; i++) {

                    if (matriz[i][opcao2] != 0 && matriz[i][opcao2] != -1){
                        int result = matriz[i][opcao2] + matriz[i][opcao];
                        System.out.println("A DISTANCIA É:"+result);

                        break;
                    }

            }
        } else {
            //imprimindo a resposta caso nao seja 0 ou -1
            System.out.println("A DISTANCIA É:" + resposta);
        }

    }

    
    //METODOS AUXILIARES
    public static void imprimeMatriz(int[][] matriz, String[] nomes) {

        for (int i = 0; i < matriz.length; i++) {

            System.out.print(nomes[(i)] + ": ");

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] preencheMatriz() {

        int matriz[][] = new int[6][6];

        //Linha 0
        matriz[0][0] = -1;
        matriz[0][1] = 63;
        matriz[0][2] = 210;
        matriz[0][3] = 190;
        matriz[0][4] = 0;
        matriz[0][5] = 190;
        //Linha 1
        matriz[1][0] = 63;
        matriz[1][1] = -1;
        matriz[1][2] = 160;
        matriz[1][3] = 150;
        matriz[1][4] = 95;
        matriz[1][5] = 0;
        //Linha 2
        matriz[2][0] = 210;
        matriz[2][1] = 160;
        matriz[2][2] = -1;
        matriz[2][3] = 10;
        matriz[2][4] = 0;
        matriz[2][5] = 0;
        //Linha 3
        matriz[3][0] = 190;
        matriz[3][1] = 150;
        matriz[3][2] = 10;
        matriz[3][3] = -1;
        matriz[3][4] = 0;
        matriz[3][5] = 0;
        //Linha 4
        matriz[4][0] = 0;
        matriz[4][1] = 95;
        matriz[4][2] = 0;
        matriz[4][3] = 0;
        matriz[4][4] = -1;
        matriz[4][5] = 80;
        //Linha 5
        matriz[5][0] = 190;
        matriz[5][1] = 0;
        matriz[5][2] = 0;
        matriz[5][3] = 0;
        matriz[5][4] = 80;
        matriz[5][5] = -1;

        return matriz;
    }

    public static void exibirMenu() {
        System.out.println("0 - Canceres\n"
                + "1 - BBugres\n"
                + "2 - Cuiabá\n"
                + "3 - VGrande\n"
                + "4 - Tangará\n"
                + "5 - PLacerda");
    }

}
