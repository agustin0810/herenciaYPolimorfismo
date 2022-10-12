package herenciaYPolimorfismo;

public abstract class Cuenta {
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cuenta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        Cuenta.total++;
    }
    public abstract void depositar(double valor);

    public boolean sacar (double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta destino){
        if(this.saldo>=valor){
            this.sacar(valor);
            destino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
}

