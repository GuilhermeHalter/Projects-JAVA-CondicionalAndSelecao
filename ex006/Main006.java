/*
Faça um programa que verifique se uma letra digitada é vogal ou consoante.
*/

import java.util.Scanner;

public class Main006
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		char letra = scanner.next().charAt(0);
		
		if(
		   letra == 'a' || letra == 'A'||
		   letra == 'e' || letra == 'E'||
		   letra == 'i' || letra == 'I'||
		   letra == 'o' || letra == 'O'||
		   letra == 'u' || letra == 'U'
		 ){
		    System.out.println("A letra digitada eh uma vogal");
		}else{
		    System.out.println("A letra digitada eh uma consoante");
		}
	}
}
