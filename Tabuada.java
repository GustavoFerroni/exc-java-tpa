/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
    //ler dados do usuário

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
    //guarda o número digitado

        int i = 1;
    //começa o contador em 1

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        //mostra a multiplicação
        
            i++; 
        //aumenta o contador
        
        } while (i <= 10); 
        //repete até o contador chegar a 10

        scanner.close();
        //fecha o scanner
    }
}

