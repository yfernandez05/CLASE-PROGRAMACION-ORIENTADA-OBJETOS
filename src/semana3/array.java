package semana3;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        // crear un array de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> palabras = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Metodos
        // add
        numeros.add(12);
        numeros.add(5);
        numeros.add(9);
        numeros.add(100);
        numeros.remove(2);
        imprimirArray(numeros);
        System.out.println("El valor en la posicion 2 es: " + numeros.get( 2));
        System.out.println("EL numero total de elementos es: " + numeros.size());

        palabras.add("Lunes");
        palabras.add("Martes");
        palabras.add("Miercoles");
        palabras.add("Jueves");
        palabras.add("Olla");
        palabras.remove(1);
        imprimirArray(palabras);
        System.out.println("El valor en la posicion 2 es: " + palabras.get( 2));
        System.out.println("EL numero total de elementos es: " + palabras.size());


        // Array de clases
        Empleado empl1 = new Empleado();
        Empleado empl2 = new Empleado();
        try {
            empl1.setEmpleadoId(1);
            empl1.setNombre("Yhonatan Fernandez");
            empl1.setSalario(3200.00);
            empl1.setCargo("Ing. de Sistemas");

            empl2.setEmpleadoId(2);
            empl2.setNombre("CArlos FLores");
            empl2.setSalario(1500.00);
            empl2.setCargo("Ing. de Software");
            
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println("Ha ocurrido un error al crear un empleado");
        }
        empleados.add(empl1);
        empleados.add(empl2);

        imprimirArray(empleados);

    }

    //el <?> para aceptar cualquier tipo de valor
    public static void imprimirArray(ArrayList<?> lista){
        lista.forEach(System.out::println);
    }
}
