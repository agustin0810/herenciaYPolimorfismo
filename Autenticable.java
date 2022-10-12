package herenciaYPolimorfismo;

public interface Autenticable {
    public double getBonificacion();
    public void setClave(String clave);
    public boolean iniciarSesion(String clave);

}
