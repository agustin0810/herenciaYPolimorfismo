package herenciaYPolimorfismo;

public class Administrador extends Empleado implements Autenticable {
    private String clave;
    @Override
    public double getBonificacion() {
        return 0;
    }
    @Override
    public String toString() {
        return "Administrador";
    }
    @Override
    public void setClave(String pClave){
        this.clave = pClave;
    }

    @Override
    public boolean iniciarSesion(String pClave) {
        return pClave=="DDA";
    }
}
