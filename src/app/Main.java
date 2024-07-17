package app;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Venilton");
		
		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
