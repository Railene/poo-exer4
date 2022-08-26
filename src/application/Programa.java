package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		

		System.out.print("Entre com o número da Conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome da Conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Existe um deposito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Entre com valor deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		}
		else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.println("Data da Conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira valor de deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta Atualzados:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira um valor de retirada: ");
		double retirarValor = sc.nextDouble();
		conta.retirar(retirarValor);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		sc.close();
	}
}
		                                                
