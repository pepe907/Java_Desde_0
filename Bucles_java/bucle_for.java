package Bucles_java;

import java.util.Scanner;

public class bucle_for {
    public static void main(String[] args) {
        // Bucle for Nivel 1  
        // Numeros del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Numeros del 10 al 9
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        // Numeros pares
        for (int i = 0; i <= 20; i+= 2){
            System.out.println(i);
        } 

        // Numeros impares
        for (int i = 0; i <= 30; i += 3){
            System.out.println(i);
        }

        // tabla del 7 
        for (int i = 0; i <= 70; i += 7) {
            System.out.println(i);
        }

        int suma = 0;
        
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println(suma);

        // Nivel dos 
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la tabla de Multiplicar");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "X" + i + "=" + (numero*i));
        }

        sc.close();

        // ArrayList
        int [] Numeros = {1,2,3,4,5,6,7,8,9};
        for (int i = 1; i < Numeros.length; i++) {
            System.out.println(1);
        }  

        // Nivel 3 

        int[] numeros = {4, 9, 2, 7, 1};
        for (int i = 0; i > numeros.length; i++) {
            System.out.println(i);
        }
    }
}