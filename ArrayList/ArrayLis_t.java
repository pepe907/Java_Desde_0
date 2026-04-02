package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLis_t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> numeros = new ArrayList<>();

        // agregar elementos al arraylist
        /* 
        numeros.add(20);
        numeros.add(40);
        numeros.add(60);
        numeros.add(80);
        numeros.add(15);
        numeros.add(100);
        */

       /*  // ver los numeros 
        for (int i = 0; i < numeros.size(); i ++){
            System.out.println(numeros.get(i));
        }
        */

        // Numeros mayores a 10
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > 10) {
                System.out.println(numeros.get(i));
            }
        }

        // pedir numero
        System.out.println("Escribe un numero: ");
        int numero1 = sc.nextInt();
        numeros.add(numero1);

        for (int i = 0; i < numeros.size(); i ++){
            System.out.println("Numero guardado: " + numeros.get(i));
        }

        // Ejercicio 3 Numeros existentes
        System.out.println("Ingresa un numero: ");
        int numero2 = sc.nextInt();

        boolean encontrado = false;

        for(int i = 0; i < numeros.size(); i ++){
            if (numeros.get(i) == numero2){
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Existe");
        }else {
            System.out.println("No existe");
        }

    }
}
