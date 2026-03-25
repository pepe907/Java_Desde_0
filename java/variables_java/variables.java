package java.variables_java;

public class variables {
    public static void main(String[] args) {
        /*
        - String- Almacena texto, como "Hola". Los valores de cadena están entre comillas dobles.
        - int- Almacena números enteros, sin decimales, como 123 o -123.
        - float- Almacena números de punto flotante, con decimales, como 19.99 o -19.99.
        - char- Almacena caracteres individuales, como 'a' o 'B'. Los valores de los caracteres se encierran entre comillas simples.
        - boolean- Almacena valores con dos estados: verdadero o falso
        */

        // Sintaxis 
        variable nombreVariable = valores;

        // Ejemplo  String 
        String name = "Jhon";
        System.out.println(name);

        // Ejemplo  int
        int mynum = 16;
        System.out.println(mynum);

        // Ejemplo sin declarar un valor 
        int Mynum;
        Mynum = 19;
        System.out.println(Mynum);

        // Ejemplo asignar un nuevo valor
        int Numero = 16;
        Numero = 18; // Se asigna un nuevo valor
        System.out.println(Numero);

        // Variables Finales
        final int Numer = 15;
        Numer = 20; // Error no deja cambiar el numero asignado 

        // Otros tipos 
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
    }
}
