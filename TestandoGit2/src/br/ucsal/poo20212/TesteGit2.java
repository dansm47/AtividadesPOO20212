package br.ucsal.poo20212;

import java.util.Scanner;

public class TesteGit2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo numero");
		int num2 = sc.nextInt();
		int result = num1+num2;
		System.out.println("Resultado da soma é " +result);
		sc.close();
		System.out.println("Está parte do codigo foi editada no git");

	}

}
