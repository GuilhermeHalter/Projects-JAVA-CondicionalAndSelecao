/*
Faça um programa que verifique se a letra digitada for: F ou M e imprima uma mensagem: masculino, feminino ou sexo inválido.
*/

import java.util.Scanner;

public class Main005
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o sexo (F ou M)");
		char letra = scanner.next().charAt(0);
		
		if(letra == 'm' || letra == 'M'){
		    System.out.println("o sexo eh masculino");
		}else if(letra == 'f' || letra == 'F'){
        System.out.println("o sexo eh feminino");
		}else{
		    System.out.println("sexo invalido");
		}
	}
}
