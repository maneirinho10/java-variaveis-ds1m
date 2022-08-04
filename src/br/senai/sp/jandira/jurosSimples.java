package br.senai.sp.jandira;

import java.util.Scanner;

public class jurosSimples {

	public static void main(String[] args) {
		
		double juros, capital, taxa, tempo ;
		Scanner leitor; 
		
		leitor = new Scanner (System.in);

		System.out.print("Qual é o capital? ");
		capital = leitor.nextDouble();
		
		System.out.print("Qual é a taxa de juros? ");
		taxa = leitor.nextDouble();
		
		System.out.print("Qual é o tempo? ");
		tempo = leitor.nextDouble();
		
		juros = capital * taxa / 100 * tempo; // j = C.i.t
		
		System.out.print("O valor do juros é: " + juros);
		System.out.println();
		System.out.printf(" Ao finai do periodo você terá R$%s" , juros + capital);
		
	}

}
