package herenciaYPolimorfismo;
public class TestSistema {
    public static void main(String[] args) {
        Director director = new Director();
        Administrador administrador = new Administrador();
        SistemaLogin sistemaLogin = new SistemaLogin();
        sistemaLogin.autenticar(director);
        sistemaLogin.autenticar(administrador);
    }

}
