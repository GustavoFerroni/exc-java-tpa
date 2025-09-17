/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor final: ");
        int fim = scanner.nextInt();

        int soma = 0;
        int num = inicio;

        do {
            if (num % 2 != 0) { //se for ímpar
                soma = soma + num; //soma ao total
            }
            num = num + 1; //próximo número
        } while (num <= fim);

        System.out.println("Soma dos ímpares: " + soma); //soma dos numeros impares

        scanner.close(); // fecha o scanner
    }
}

