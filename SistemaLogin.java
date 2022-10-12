package herenciaYPolimorfismo;
public class SistemaLogin {
    private String pass = "DDA";

    public boolean autenticar(Autenticable autenticable){
        boolean autenticado = autenticable.iniciarSesion(pass);
        if(autenticado){
            System.out.println(autenticable.toString() + " logueado en el sistema");
            return true;
        }else{
            System.out.println(autenticable.toString() + " Error en el login");
            return false;
        }
    }
}
