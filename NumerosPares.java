/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class NumerosPares {
    public static void main(String[] args) {
        int numero = 2; 
    //começa pelo primeiro número par

        do {
            System.out.println(numero);
            numero += 2; 
         //incrementa de 2 em 2 para garantir que seja par
         
        } while (numero <= 20); 
        //continua enquanto o número for menor ou igual a 20
    }
}
