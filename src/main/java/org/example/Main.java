package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ATRIBUTOS
        int n1, n2;
        Scanner entrada = new Scanner(System.in);

        //ENTRADA-LECTURA DE DATOS
        System.out.println("Dame un núm: ");
        n1 = entrada.nextInt();
        System.out.println("Dame otro núm");
        n2 = entrada.nextInt();

        //SALIDA POR CONSOLA
        System.out.println("La suma de" + n1 + " y " + n2 + "es " + (n1 + n2));
        System.out.println("La resta de" + n1 + " y " + n2 + "es " + (n1 - n2));
    }
}