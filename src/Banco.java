import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Banco{
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void abrirConta(Cliente cliente, TipoConta tipoConta) {
        Conta novaConta;
        if (tipoConta == TipoConta.CONTA_CORRENTE) {
            novaConta = new ContaCorrente(cliente, tipoConta);
        } else {
            novaConta = new ContaPoupanca(cliente, tipoConta);
        }
        this.contas.add(novaConta);
    }
}