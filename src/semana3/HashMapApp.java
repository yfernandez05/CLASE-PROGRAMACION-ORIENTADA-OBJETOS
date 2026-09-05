package semana3;
import java.util.HashMap; 

public class HashMapApp {
    public static void main(String[] args) {
        // HashMap -> almacena valores usando clave, valor
        HashMap<Integer, Empleado> empleados = new HashMap<>();
        //clave 1 , valor:EMpleado(1, yhohnatan, 4000)
        Empleado empleado1 = new  Empleado();
        Empleado empleado2 = new  Empleado();

        try {
            empleado1.setEmpleadoId(1);
            empleado1.setNombre("Yhonatan Fernandez");
            empleado1.setSalario(3200.00);
            empleado1.setCargo("Ing. de Sistemas");

            empleado2.setEmpleadoId(2);
            empleado2.setNombre("Julian Aguilar");
            empleado2.setSalario(1500.00);
            empleado2.setCargo("Ing. de Software");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println("Ha ocurrido un error al crear un empleado");
        }

        //Agregar informacion de un hashmap <clave, valor>
        empleados.put(1, empleado1); 
        empleados.put(2, empleado2); 

        // Obtener informacion en este caso la key 2
        Empleado empleadoBuscar = empleados.get( 2);
        System.out.println(empleadoBuscar);

        // Contains - hacer busqueda por clave
        System.out.println("Contiene clave2: " + empleados.containsKey(1));

    }
}
