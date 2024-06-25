import com.dioBank.entities.*;


public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        Cliente primeiroCliente = new Cliente();
        primeiroCliente.setNome("Venilton");

        Conta contaCorrente = new ContaCorrente(primeiroCliente);
        Conta contaPoupanca = new ContaPoupanca(primeiroCliente);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);
        contaPoupanca.sacar(50);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        banco.addConta(contaCorrente);
        banco.addConta(contaPoupanca);
        System.out.println(banco.getContas());

    }
}