import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion, numero1, numero2;

        do {
            System.out.println("Bienvenido");

            System.out.println(" Ingresa tu numero: ");
            numero1 = sc.nextInt();

            System.out.println(" Elije el operador ");
            System.out.println(" 1 Suma ");
            System.out.println(" 2 Resta ");
            System.out.println(" 3 Multiplicación ");
            System.out.println(" 4 Division ");
            System.out.println(" 0 Salir ");
            opcion = sc.nextInt();

            System.out.println("Ingresa otro numero: ");
            numero2 = sc.nextInt();
            sc.nextLine();

            if(opcion == 0){
                System.out.println("Saliendo del programa...");
            }else {
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + (numero1 + numero2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + (numero1 - numero2));
                    break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + (numero1 * numero2));
                    break;
                    case 4:
                        System.out.println("Resultado de la division: " + (numero1 / numero2));
                    break;
                    default:
                        System.out.println("Opción no valida");
                }
            }
        }while (opcion != 0);
    }
}
