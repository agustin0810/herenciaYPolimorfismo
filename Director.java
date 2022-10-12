package herenciaYPolimorfismo;
public class Director extends Empleado implements Autenticable{
    private String clave;
    @Override
    public double getBonificacion() {
        System.out.println("Ejecutando bonificación desde la clase Director");
        return super.getSueldo() +
                this.getSueldo()*0.05;
    }

    @Override
    public String toString() {
        return "Director";
    }

    @Override
    public void setClave(String pClave) {
        this.clave=pClave;
    }

    @Override
    public boolean iniciarSesion(String pClave) {
        return pClave=="DDA";
    }
}
