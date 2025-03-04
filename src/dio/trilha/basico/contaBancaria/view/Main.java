package dio.trilha.basico.contaBancaria.view;

import dio.trilha.basico.contaBancaria.model.ContaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Banco, vamos criar sua!\n");
		
		System.out.print("Número da conta: ");
		int conta = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Agência: ");
		String agencia = entrada.nextLine();
		
		System.out.print("Informe o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Saldo atual: ");
		Float saldo = Float.parseFloat(entrada.nextLine());
		
		entrada.close();
		
		ContaBancaria ct = new ContaBancaria(conta, agencia, nome, saldo);
		
		System.out.println("Olá "+ ct.getNomeCliente() +", obrigado por criar uma conta "
				+ "em nosso banco.\nSua agência é "+ ct.getAgencia() +", conta "+ ct.getNumero() 
				+ "\nSeu saldo "+ ct.getSaldo() +" já está disponível para saque");
		
	}

}
