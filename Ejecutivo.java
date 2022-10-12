package herenciaYPolimorfismo;
public class Ejecutivo extends Empleado {

    @Override
    public double getBonificacion() {
        System.out.println("Ejecutando la bonificación desde clase Ejecutivo");
        return 200;
    }
}
