package br.unipe.java.unidade1;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float media;

		System.out.println("Digite a primeira nota\n");
		Scanner leitor = new Scanner(System.in);
		nota1 = leitor.nextFloat();
		System.out.println("Digite a segunda nota\n");
		nota2 = leitor.nextFloat();
		System.out.println("Digite a terceira nota\n");
		nota3 = leitor.nextFloat();

		media = ((nota1 + nota2 + nota3) / 3);

		if (media >= 7.0) {
			System.out.println("Parabéns você foi APROVADO \n");
		}

		else if ((media >= 5.0) && (media < 7.0)) {
			System.out.println("Aluno em RECUPEREÇÃO\n");

		}
		
		else {
			System.out.println("Aluno REPROVADO\n");
		}
	}

}
