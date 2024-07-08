/*
Faça um programa que peça dois números e imprima o maior deles.
*/

import java.util.Scanner;

public class Main000
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero:  ");
        int num1 = scanner.nextInt();
        
        System.out.println("Informe outro numero:  ");
        int num2 = scanner.nextInt();
        
        if(num1 > num2){
            System.out.println("O maior numero eh o " + num1);
        }else{
            System.out.println("O maior numero eh o " + num2);
        }
	}
}
