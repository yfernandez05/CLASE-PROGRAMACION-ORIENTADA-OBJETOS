package semana3;
public class AppEmpleado {
    public static void main(String[] args) {

        Empleado empl = new Empleado();
        double bono;

        try {
            empl.setEmpleadoId(1);
            empl.setNombre("Yhonatan Fernandez");
            empl.setSalario(3200.00);
            empl.setCargo("Ing. de Sistemas");
            
            //llamar a la funciones
            bono = empl.calcularBono(5);
            System.out.println("Bono: " + bono);
            Empleado.contarEmpleados();
            empl.mostrarInfo();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println("Ha ocurrido un error al crear un empleado");
        }

    }
}   
