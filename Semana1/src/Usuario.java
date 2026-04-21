public class Usuario {
    String nombre;
    int edad;

    Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public void saludar () {
        System.out.println("Hola: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
