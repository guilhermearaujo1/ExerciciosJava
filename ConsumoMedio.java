package br.unipe.java.unidade1;

import java.util.Scanner;

public class ConsumoMedio {
	public static void main(String[] args) {
		double km;
		double litros;
		
		System.out.println("Digite a dist�ncia total percorrida: \n");
		Scanner input = new Scanner(System.in);
		km = input.nextDouble();
		System.out.println("Digite o total de combustivel gasto: \n");
		litros = input.nextDouble();
		
		System.out.println("O consumo m�dio do autom�vel � " + (km/litros)	+ " litros por km percorridos");
	}
}
