package br.unipe.java.unidade1;

import java.util.Scanner;

public class ExercicioAula {
	public static void main(String[] args) {
	
		System.out.println("Digite o primeiro numero: ");
		int z = 0;
		Scanner leitor = new Scanner(System.in);
		z = leitor.nextInt();
		System.out.println("Digite o segundo numero: ");
		int x = 0;
		x = leitor.nextInt();
		
		System.out.println("A soma desejada é " + (x+z));
	}
}
