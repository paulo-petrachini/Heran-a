package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldo;
	
	public Conta(String nomeTitular, String cpf, int numeroConta) {
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public float getSaldo() {
		return saldo;
	}
	
	public void creditar(float valor) {
		this.saldo = saldo + valor;
	}

	public boolean debitar(float valor) {
		if (valor > saldo) {
			return false;
		} else {
			this.saldo = saldo - valor;
			return true;
		}
	}
	
}
