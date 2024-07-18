/*
Faça um programa que peça um número e se este número for par, transforme-o em ímpar e vice-versa
*/

import java.util.Scanner;

public class Main003
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num = scanner.nextInt();
		
		if(num % 2 == 0){
		    num++;
		    System.out.println(num + " o numero eh impar");
		}else{
		    num--;
		    System.out.println(num + " o numero eh par");
		}
	}
}
