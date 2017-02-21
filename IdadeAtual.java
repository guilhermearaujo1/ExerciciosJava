package br.unipe.java.unidade1;

import java.util.Scanner;

public class IdadeAtual {
	public static void main(String[] args) {
		int ano;
		int anoAtual;
		int idade;
		System.out.println("Informe o ano de nascimento: ");
		Scanner leitor = new Scanner(System.in);
		ano = leitor.nextInt();
		System.out.println("Informe o ano atual: ");
		anoAtual = leitor.nextInt();
		idade = anoAtual - ano;
		System.out.println("A idade atual é" + idade);
		
	}
}
