package herenciaYPolimorfismo;

public class ControlBonificacion {
    private double suma;
    public double registrarSueldo(Empleado empleado){
        this.suma += empleado.getBonificacion();
        System.out.println("La suma hasta ahora: " + this.suma);
        return suma;
    }
}
