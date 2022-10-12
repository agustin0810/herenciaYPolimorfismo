package herenciaYPolimorfismo;
public class TestEmpleado {
    public static void main(String[] args) {

        Empleado carlos = new Director();
        carlos.setNombre("Carlos");
        carlos.setCI("1.234.567-8");
        carlos.setSueldo(200);

        System.out.println(carlos.getSueldo());
        System.out.println(carlos.getBonificacion());
    }
}
