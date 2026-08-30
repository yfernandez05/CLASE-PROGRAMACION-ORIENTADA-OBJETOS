public class Estudiante {
    String codigo;
    String nombre;
    double promedio;
    int edad;
    boolean becado;
    char sexo;

    public void mostrarDatos() {
        System.out.println("\n=======================\nLos datos del estudiante son:");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Edad: " + edad);
        System.out.println("Becado: " + becado);
        System.out.println("Sexo: " + sexo);
    }
}
