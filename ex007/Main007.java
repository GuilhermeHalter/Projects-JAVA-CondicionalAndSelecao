/*
Faça um programa que leia 3 valores inteiros e exiba-os em ordem crescente.
*/

import java.util.Scanner;

public class Main007
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite um numero");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite um segundo numero");
		int num2 = scanner.nextInt();

		System.out.println("Digite um terceiro numero");
		int num3 = scanner.nextInt();

		if(num1 < num2 && num2 < num3){
            System.out.printf("%d %d %d", num1, num2, num3);
		}else if(num1 < num3 && num3 < num2){
		    System.out.printf("%d %d %d", num1, num3, num2);
		}else if(num2 < num1 && num1 < num3){
		    System.out.printf("%d %d %d", num2, num1, num3);
		}else if(num2 < num3 && num3 < num1){
		    System.out.printf("%d %d %d", num2, num3, num1);
		}else if(num3 < num2 && num2 < num1){
		    System.out.printf("%d %d %d", num3, num2, num1);
		}else{
		    System.out.printf("%d %d %d", num3, num1, num2);
		}
	}
}
