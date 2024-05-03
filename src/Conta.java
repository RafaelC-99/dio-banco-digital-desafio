import lombok.Getter;

@Getter
public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected TipoConta tipoConta;

    protected static final int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL=1;

    public Conta(Cliente cliente, TipoConta tipoConta){
        this.agencia=Conta.AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    @Override
    public void sacar(double valor) {
        this.saldo-=valor;
    }
    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void printDefaultInfo(){
        System.out.println(String.format("Agencia - %d | Numero - %d",this.agencia, this.numero));
        System.out.println(String.format("Saldo - %.2f",this.saldo));
    }
}