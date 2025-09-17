/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ContarNumeros {
    public static void main(String[] args) {
        // explica como funciona a contagem
        int inicio = 100;
        int fim = 125;
        int contador = inicio;
        int quantidade = 0;

        do {
            quantidade++;   //conta o número atual
            contador++;     //passa para o próximo número
        } while (contador <= fim);

        System.out.println("Quantidade de números entre " + inicio + " e " + fim + ": " + quantidade);
    }
}
