/*
Faça um programa que implemente uma calculadora simples. O programa deve solicitar os operandos e o operador e mostrar a entrada e o resultado. Inclua verificadores de erro para operadores inválidos e tentativa de divisão por zero. 
O menu será como segue:
[ 1 ] – Adição
[ 2 ] – Subtração
[ 3 ] – Multiplicação
[ 4 ] – Divisão
[ 5 ] – Fim
*/

import java.util.Scanner;

public class Main010
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("[ 1 ] – Adição");
	    System.out.println("[ 2 ] – Subtração");
	    System.out.println("[ 3 ] – Multiplicação");
	    System.out.println("[ 4 ] – Divisão");
	    System.out.println("[ 5 ] – Fim");

        
        System.out.println("Digite uma opcao");
		int opcao = scanner.nextInt();
	    
		System.out.println("Digite um numero");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite outro numero");
		int num2 = scanner.nextInt();
		
         switch(opcao){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("nao eh possivel dividir um numero por 0; digite outro numero");
                }else{
                    System.out.println(num1 / num2);
                }
                break;
            case 5:
                break;
            default:
                    System.out.println("numero invalido");
        }
		

	}
}
