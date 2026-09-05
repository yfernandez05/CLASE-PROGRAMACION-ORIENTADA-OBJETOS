package semana3;
public class Empleado {
    // Atributos
    private int empleadoId;
    private String nombre;
    private double salario;
    private String cargo;
    private static int numeroEmpleados = 0;

    public Empleado(){ // constructor por defecto
        numeroEmpleados++;
    }

    // solos e haec uso de esto en caso se quieronhacer uso del cosntrucotr lleno en el main cuando instanciamos a la clase pero pasandole ya los parametros directamente
    public Empleado(int empleadoId, String nombre, double salario, String cargo) {
        //asignamos las varaibels entrantes hagan lo mismo que si estuvieramos instanciando una clase y llamando al Set y asi reutilizamos las validaciones
        setEmpleadoId(empleadoId);
        setNombre(nombre);
        setSalario(salario);
        setCargo(cargo);
        numeroEmpleados++;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        if(empleadoId == 0){
            throw new IllegalArgumentException("El ID del empleado debe ser valido. ");
        }else{
            this.empleadoId = empleadoId;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length() == 0 || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre debe ser valido");
        }else{
            this.nombre = nombre;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0 ){
            throw new IllegalArgumentException("Ingrese un salario valido");
        }else{
            this.salario = salario;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //funciones metodos:
    public static void contarEmpleados(){
        System.out.println("Empleados registrados: " + numeroEmpleados);
    }

    public double calcularBono(int meses){
        if(meses <= 0 ){
            throw new IllegalArgumentException("Ingrese numero de meses validos");
        }
        return salario * meses * 0.10;
    }

    public void mostrarInfo(){
        // %d valores enteros
        // %f valores decimales
        // %s cadenas de texto
        System.out.printf("Datos del Empleado: \n ---------------------- \n ID: %d \n Nombre: %s \n Salario: %.2f\n Cargo: %s \n",
        empleadoId, nombre, salario, cargo);
    }

    //hacemos que cuandop utlicn la clase  toString se formatee, ya que ventualmeten al ahcer pirntln se ahce internamnte toString
    // Al imprimir un objeto con println, Java utiliza internamente toString().
    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Salario: %.2f | Cargo: %s", 
                empleadoId, nombre, salario, cargo);
    }
}