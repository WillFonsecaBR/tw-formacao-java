package tw_java_fundamentos.main;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		// FAZENDO LEITURO COM PACKAGE SCANNER
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = scanner.next();
		System.out.println("Seja bem vindo "+ nome);
		scanner.close();	
	}
}
