import lombok.Getter;

@Getter
public class ContaPoupanca extends Conta{
    private double taxaRendimento;

    public ContaPoupanca(Cliente cliente, TipoConta tipoConta) {
        super(cliente, tipoConta);
        this.taxaRendimento=0.02;
    }

    @Override
    public void extrato() {
        System.out.println("Extrato Conta Poupanca: "); 
        this.printDefaultInfo();        
    }

}
