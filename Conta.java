package dio.desafios.ContasBancarias;
import java.util.Random;

public abstract class Conta implements Iconta{
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String tipoConta;
	
	Random aleatorio = new Random();
	
	

	public Conta() {
		this.agencia = 0000;
		this.numero = 00000;
		this.saldo = this.saldo;
		this.tipoConta = tipoConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("------------Extrato "+this.tipoConta+"------------");
		System.out.println(String.format("Agęcia: %d", this.agencia));
		System.out.println(String.format("Número Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
		
	}
	
	
}