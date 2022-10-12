package herenciaYPolimorfismo;
public class Cliente implements Autenticable{
    private String nombre;
    private String ci;
    private String telefono;
    private String clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public double getBonificacion() {
        return 0;
    }
    @Override
    public void setClave(String pClave){
        this.clave = pClave;
    }

    @Override
    public boolean iniciarSesion(String pClave) {
        return this.clave=="DDA";
    }
}
