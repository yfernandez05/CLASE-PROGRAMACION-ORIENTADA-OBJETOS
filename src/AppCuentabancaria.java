public class AppCuentabancaria {
    public static void main(String[] arg){
        // Atriutos de la nueva cuetna banca usando constructor vacio
        CuentaBancaria cuenta_sueldo = new CuentaBancaria();
        String result = "";
        try {
            cuenta_sueldo.setSaldo(400.00);
            cuenta_sueldo.setNumeroCuenta("87878787");
            System.err.println("Saldo: " +cuenta_sueldo.getSaldo());
            System.err.println("Cuenta: " +cuenta_sueldo.getNumeroCuenta());
            result = "Cuenta creada correctamente";
        } catch (IllegalArgumentException ex) {
            result = "Cuenta creada correctamente";
        }catch (Exception ex){
            result = "Cuenta creada correctamente";
        }

        System.out.println(result);

        // Sobrecarga sin metodos
        cuenta_sueldo.mostrarInformacion();

        System.err.println("===========================");

        
        // Atriutos de la nueva cuenta banca usando constructor sobrecargado
        Double _saldo = 150.00;
        String _numero_cuenta = "12345678";
        CuentaBancaria cuenta_corriente = new CuentaBancaria(_saldo, _numero_cuenta);
        System.err.println("Saldo: " + cuenta_corriente.getSaldo());
        System.err.println("Cuenta: " + cuenta_corriente.getNumeroCuenta());

        // Sobrecarga de metodos
        // la IDE JAVA sabe a cula llamar dependiendo los valores les estas ingresando la cantidasd mas que el tipo
        cuenta_corriente.mostrarInformacion(true);

    }
    
}
