/*
Faça um programa que peça um número e informe se o número é inteiro ou quebrado
*/

import java.util.Scanner;

public class Main004
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double num = scanner.nextDouble();
		
		if(num == (int)num){
		    System.out.println("esse numero eh inteiro");
		}else{
        System.out.println("esse numero eh quebrado");
		}
	}
}
