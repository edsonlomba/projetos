/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tia41525388;

/**
 *
 * @author 41525388
 */
public class Calculos {
    public float calc(int[] digitos, int modo) {
        float valor = 0;
        float soma = 0;
        float media = 0;
        int maior = 0;
        int menor;
        int count = 0;
        int repetido = 0;
        int[] repetidos = new int[8];
        int par = 0;
        int impar = 0;
        float somaprimeiros = 0;
        float somaultimos = 0;
        float divisao = 0;
        int produto1 = 1;
        int produto2 = 1;
        switch(modo){
            case 1:
                for (int i = 0; i < digitos.length; i++) {
                    soma += + digitos[i];
                }
                System.out.println("Soma: " + soma);
                valor = soma;
                ;
                break;
            case 2:
                for (int i = 0; i < digitos.length; i++) {
                    soma += digitos[i];
                }
                media = soma/8;
                System.out.println("Media: " + media);
                valor = media;
                ; 
                break;
            case 3:
                for (int i = 0; i < digitos.length; i++) {
                    if(digitos[i] > maior){
                        maior = digitos[i];
                    }
                }
                System.out.println("Maior: " + maior);
                valor = maior;
                ;
                break;
            case 4:
                menor = digitos[0];;
                for (int i = 0; i < digitos.length; i++) {
                    if(digitos[i] < menor){
                        menor = digitos[i];
                    }
                }
                System.out.println("Menor: " + menor);
                valor = menor;
                ;
                break;
            case 5:
                boolean repete = false;
                int k = 0;
                for (int i = 0; i < digitos.length; i++) {
                    for (int j = 0; j < digitos.length; j++) {
                        if(j != i){
                            if(digitos[j] == digitos[i]){
                                repete = true;
                                repetidos[k] = digitos[i];
                                k++;
                            }
                        }
                    }
                }
                System.out.println("Repetido: " + repetidos[0]);
                if (repete == true) {
                    valor = repetidos[0];
                }
                else{
                    valor = -1;
                }
                ;
                break;
            case 6:
                for (int i = 0; i < digitos.length; i++) {
                    if((digitos[i]%2) == 0){
                        par++;
                    }
                }
                System.out.println("Quantidade de pares: " + par);
                valor = par;
                ;
                break;
            case 7:
                for (int i = 0; i < digitos.length; i++) {
                    if((digitos[i]%2) == 1){
                        impar++;
                    }
                }
                System.out.println("Quantidade de impares: " + impar);
                valor = impar;
                ;
                break;
            case 8:
                for (int i = 0; i < digitos.length; i++) {;
                    if(i <= 3){
                        somaprimeiros += digitos[i];
                    }
                    if(i > 3){
                        somaultimos += digitos[i];
                }
                    divisao = somaprimeiros/somaultimos;
                }
                System.out.println("Divisao: " + divisao);
                valor = divisao;
                ;
                break;
            case 9:
                for (int i = 0; i < digitos.length; i++) {
                    if(digitos[i] != 0){
                        produto1 *= digitos[i];
                    }
                }
                System.out.println("Produto sem 0: " + produto1);
                valor = produto1;
                ;
                break;
            case 10:
                for (int i = 0; i < digitos.length; i++) {
                    if(digitos[i] > maior){
                        maior = digitos[i];
                    }
                }
                for (int i = 0; i < digitos.length; i++) {
                    if(digitos[i] != 0 && digitos[i] != maior){
                        produto2 *= digitos[i];
                    }
                }
                System.out.println("Produto sem 0 e sem " + maior + ": " + produto2);
                valor = produto2;                
                ;
                break;
    }
    
    return valor;
    }

}
