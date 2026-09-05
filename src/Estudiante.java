public class Estudiante {
    String codigo;
    String nombre;
    private double promedio;
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

    public void establecerPromedio(double _promedio){
        if (_promedio <  0 || _promedio > 20) {
            System.err.println("El promedio debe estar entre 0 y 20");
        }
        this.promedio = _promedio;
    }
}
