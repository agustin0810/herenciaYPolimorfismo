package herenciaYPolimorfismo;
public class EmpleadoLogin extends Empleado{
    @Override
    public double getBonificacion() {
        return 0;
    }

    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return clave.equals("DDA");
    }
}
