import   java.util.Scanner;

public class semana1 {
    private String name;
    private int edad;

    public semana1(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() { return name; }
    public int getEdad() { return edad; }

    public void setName(String name) { this.name = name; }
    public void setEdad(int edad) { this.edad = edad; }

    public void saludar(String name, int edad) {
        System.out.println("Mi nombre es : " + this.name);
        System.out.println("Edad es : " + this.edad);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        var persona = new semana1(nombre,edad);
        persona.saludar(nombre,edad);
    }
}
