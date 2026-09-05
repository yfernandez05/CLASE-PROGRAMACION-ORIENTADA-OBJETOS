public class CuentaBancaria {
    private double saldo;
    private String numero_cuenta;

    //constructor vacio
    public CuentaBancaria(){

    }
    
    //constructor sobrecarcado
    public CuentaBancaria(double _saldo, String _numerocuenta){
        setNumeroCuenta(_numerocuenta);
        setSaldo(_saldo);
    }

    // Metodos
    public void setSaldo(double _saldo){
        if (_saldo > 0) {
            this.saldo = _saldo;
        }else{
            System.err.println("Existe un error al establecer el saldo");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNumeroCuenta(String _numerocuenta){
        if (_numerocuenta.length() != 8) {
            System.err.println("EL numero de cuenta tiene que ser diferente a  8");
        }else{
            this.numero_cuenta = _numerocuenta;
        }
    }

    public String getNumeroCuenta(){
        return this.numero_cuenta;
    }

    //metodo
    public void mostrarInformacion() {
        System.out.println(this.numero_cuenta);
    }

    // sobrecarga de metodo
    public void mostrarInformacion(boolean conSaldo){
        if (conSaldo == true) {
            System.out.println("Cuenta: " + this.numero_cuenta + "\t" + "sueldo: " + this.saldo);
        }
    }
    public void mostrarInformacion(int numero){
        System.out.println("Numero entero: " + numero );
    }
}
