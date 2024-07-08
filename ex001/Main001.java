/*
Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
*/

import java.util.Scanner;

public class Main001
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero:  ");
        int num = scanner.nextInt();
        
        
        if(num < 0){
            System.out.println("O numero eh negativo");
        }else if (num == 0){
            System.out.println("O numero eh neutro");
        }else{
            System.out.println("O numero eh positivo");
        }
	}
}
