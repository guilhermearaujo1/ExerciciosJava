package br.unipe.java.unidade1;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {
		String nome;
		int idade;
		
		System.out.println("Informe seu nome: ");
		Scanner leitor = new Scanner(System.in);
		nome = leitor.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = leitor.nextInt();
		
		System.out.println("Nome "+ nome + " e sua idade "+ idade);
	}
}
