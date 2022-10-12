package herenciaYPolimorfismo;
public class TestControlBonificacion {
    public static void main(String[] args) {
        Empleado empleado = new Director();
        empleado.setSueldo(2000);

        Director director = new Director();
        director.setSueldo(10000);

        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.setSueldo(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSueldo(empleado);
        controlBonificacion.registrarSueldo(director);
        controlBonificacion.registrarSueldo(ejecutivo);
    }
}
