package dio.desafios.ContasBancarias;

import dio.desafios.ContasBancarias.ContaCorrente;
import dio.desafios.ContasBancarias.ContaPoupanca;
import java.util.Date;
import java.util.Scanner;

public abstract class Pessoa {
	Scanner Input = new Scanner(System.in);
	private String nome;
	private String CPF;
	private int idade;
	private Date dataDeNascimento;
	
	/*public void abrirConta(int tipoConta) {
		int selecaoOpcao = 0;
		
		while(selecaoOpcao != 1 || selecaoOpcao != 2){
			if (selecaoOpcao != 1 || selecaoOpcao != 2) {
				System.out.println("Opção Incorreta, tente novamente !");
				continue;
			}
			System.out.println("------------------------------------");
			System.out.println("Olá Cliente, Verifiquei que deseja abrir uma conta em nosso banco, porfavor selecione uma opção abaixo:  ?");
			System.out.println("1 - Conta Corrente: ");
			System.out.println("2 - Conta Salário:  ");
			selecaoOpcao = Input.nextInt();
		}
			
		
	}*/
	
	public void fecharConta() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public void abrirConta() {
		System.out.println("------------------------------------");
		System.out.println("Olá Cliente, Verifiquei que deseja abrir uma conta em nosso banco, porfavor selecione uma opção abaixo:  ?");
		System.out.println("1 - Conta Corrente: ");
		System.out.println("2 - Conta Salário:  ");
		int selecaoOpcao = Input.nextInt();
		
		while(selecaoOpcao != 1 || selecaoOpcao != 2){
			if (selecaoOpcao != 1 || selecaoOpcao != 2) {
				System.out.println("Opção Incorreta, tente novamente !");
				break;
			}
		}
			
		
	}
	
	
}
