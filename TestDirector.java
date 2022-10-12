package herenciaYPolimorfismo;
public class TestDirector {
    public static void main(String[] args) {
        Director director = new Director();
        director.setSueldo(6000);
        director.setClave("DDA");
        System.out.println(director.getBonificacion());
        System.out.println(director.iniciarSesion("DDA"));
    }
}
