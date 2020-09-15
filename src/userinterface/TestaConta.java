package userinterface;

import java.util.Scanner;

import core.Conta;
import core.ContaEspecial;

public class TestaConta {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		float credito;
		float debito;
		
		Conta conta = new Conta("Paulo", "123.456.789-99",123);
		
		System.out.println(conta.getNumeroConta()+":"+conta.getNomeTitular()+"("+conta.getCpf()+") R$"+conta.getSaldo());

	//	conta.setNomeTitular("Paulo");
	//	conta.setCpf("123.456.789-99");
	//	conta.setNumeroConta(123);

		System.out.println("Informe o valor a creditar");
		credito = teclado.nextFloat();
		// credito = 500.0f;
		conta.creditar(credito);
		System.out.println(conta.getNumeroConta()+":"+conta.getNomeTitular()+"("+conta.getCpf()+") R$"+conta.getSaldo());
		
		System.out.println("Informe o valor a debitar");
		debito = teclado.nextFloat();
		// debito  = 800.0f;
		boolean resul = conta.debitar(debito);
		
		if (resul == true) {
			System.out.println("Débito efetuado com sucesso");
			System.out.println("Valor debitado: "+debito+" Saldo: "+conta.getSaldo());
		} else {
			System.out.println("Valor a debitar: "+debito+" Saldo insuficiente: "+conta.getSaldo());
		}
		System.out.println();
		
		ContaEspecial c2;
		c2 = new ContaEspecial("Jose das Couves","222.333.444-55",9876, 500.0f);
		
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		c2.creditar(1000);
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		if (c2.debitar(800)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		
		if (c2.debitar(500)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
	teclado.close();
	}

}
