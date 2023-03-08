package dio.desafios.ContasBancarias;

public class AppBanco {

	public static void main(String[] args) {
		Conta conta1 = new ContaCorrente();
		Conta conta2 = new ContaPoupanca();
		Cliente cliente1 = new Cliente();
	
		
		cliente1.abrirConta();
		
		
		
		//conta1.depositar(100);
		//conta1.transferir(100, conta2);
		//conta2.imprimirExtrato();
		//conta1.imprimirExtrato();
	}

}
