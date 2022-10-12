package herenciaYPolimorfismo;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }
    @Override
    public boolean sacar(double valor){
        double comision = 0.02;
        return super.sacar(valor + (valor * comision));
    }
    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }
}
