package dio.desafios.ContasBancarias;

import java.util.Date;

public class Cliente extends Pessoa {
	private String nome;
	private String CPF;
	private int idade;
	private Date dataDeNascimento;
	
	
	public void abrirConta() {
		
	}
	@Override
	public void fecharConta() {
		
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getCPF() {
		return CPF;
	}

	@Override
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	@Override
	public int getIdade() {
		return idade;
	}
	
	@Override
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	@Override
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
}
