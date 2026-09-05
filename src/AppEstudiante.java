public class AppEstudiante {
    public static void main(String[] args) throws Exception {
        Estudiante maria = new Estudiante();
        maria.codigo = "0001";
        maria.nombre = "MAria";
        /* maria.promedio = 12.5;
        maria.promedio = 25; */
        maria.mostrarDatos();

        Estudiante juana = new Estudiante();
        juana.codigo = "0001";
        juana.nombre = "JUANA";
        /* juana.promedio = 17.4; */
        juana.mostrarDatos();

        Estudiante mario = new Estudiante();
        mario.codigo = "0001";
        mario.nombre = "Mario";
        /* mario.promedio = 19.0; */
        mario.mostrarDatos();

    }
}
