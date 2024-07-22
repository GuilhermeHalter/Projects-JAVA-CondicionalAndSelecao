/*
Faça um programa que peça três notas de um aluno e calcule a média. 
Analisar a média e imprimir uma das mensagens a seguir:
A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada; 
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada; 
A mensagem "Aprovado com Distinção", se a média for igual a 10. 
*/

import java.util.Scanner;

public class Main008
{
	public static void main(String[] args) {
	    
	  Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite nota 1");
		int nota1 = scanner.nextInt();
		
		System.out.println("Digite nota 2");
		int nota2 = scanner.nextInt();

		System.out.println("Digite nota 3");
		int nota3 = scanner.nextInt();
		
		int media = (nota1 + nota2 + nota3) / 3;
		
		if(media < 7){
		    System.out.println(media + " Reprovado");
		}else if(media == 10){
		    System.out.println(media +" Aprovado com Distinção");
		}else if(media >= 7){
		    System.out.println(media +" Aprovado");
		}
	}
}
