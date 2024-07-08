/*
Faça um programa que peça um número e imprima se o número é par ou ímpar
*/

import java.util.Scanner;

public class Main001
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero:  ");
        int num = scanner.nextInt();
        
        
        if(num % 2 == 0){
            System.out.println("O numero eh par");
        }else{
            System.out.println("O numero eh impar");
        }
	}
}
