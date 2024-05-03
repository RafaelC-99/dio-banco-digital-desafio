public class App {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Joao","rua do joao","22222222","joao@joao.com");
        Cliente cliente2 = new Cliente("Maria","rua da maria", "444444444","maria@maria.com");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        banco.abrirConta(cliente1, TipoConta.CONTA_CORRENTE);
        banco.abrirConta(cliente2, TipoConta.CONTA_POUPANCA);

        System.out.println("Contas Registradas no Banco:");
        for (Conta conta : banco.getContas()) {
            System.out.println("Cliente: " + conta.getCliente().getNome());
            System.out.println("Tipo de Conta: " + conta.getTipoConta());
            System.out.println("Agencia: " + conta.getAgencia());
            System.out.println("Numero: " + conta.getNumero());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        }

        banco.getContas().get(0).depositar(1000);
        banco.getContas().get(1).depositar(500);

        banco.getContas().get(0).extrato();
        banco.getContas().get(1).extrato();

        Conta origem = banco.getContas().get(0);
        Conta destino = banco.getContas().get(1);
        double valorTransferencia = 200;
        origem.transferir(valorTransferencia, destino);

        banco.getContas().get(0).extrato();
        banco.getContas().get(1).extrato();
    }
}
