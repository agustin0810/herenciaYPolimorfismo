package herenciaYPolimorfismo;
public class TestReferencia {
    public static void main(String[] args) {
        Empleado empleado = new Director();
        empleado.setNombre("Carlos");

        Director director = new Director();
        director.setNombre("Dahiana");

        empleado.setSueldo(2000);
        director.setSueldo(10000);

        director.iniciarSesion("Dahiana");
    }


}
