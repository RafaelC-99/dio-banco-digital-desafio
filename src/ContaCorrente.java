import lombok.Getter;

@Getter
public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente, TipoConta tipoConta) {
        super(cliente, tipoConta);
        this.limiteChequeEspecial=5000.0;
    }

    @Override
    public void extrato() {      
        System.out.println("Extrato Conta Corrente: ");  
        this.printDefaultInfo();
    }
}
