package br.ucsal.poo20212;

import java.util.Scanner;

public class TesteGit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		
		String name = sc.next();
	
		System.out.println("Bem vindo ao Git "+name+" !!");

		sc.close();
	}

}
