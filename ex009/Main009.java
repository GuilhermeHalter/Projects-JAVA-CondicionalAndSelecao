/*
Faça um programa que leia a idade de quatro alunos e apresente a mensagem conforme instruções: 
Se a média de idade dos alunos é inferior de 25, apresentar a mensagem "Turma Jovem"; 
Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem "Turma Adulta"; 
Se a média de idade dos alunos é acima de 40 anos, apresentar a mensagem "Turma Idosa". 
 
*/
import java.util.Scanner;

public class Main009
{
	public static void main(String[] args) {
	    
	 Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite idade do aluno 1");
		int idade1 = scanner.nextInt();
		
		System.out.println("Digite idade do aluno 2");
		int idade2 = scanner.nextInt();

		System.out.println("Digite idade do aluno 3");
		int idade3 = scanner.nextInt();
		
		System.out.println("Digite idade do aluno 4");
		int idade4 = scanner.nextInt();
		
		int media = (idade1 + idade2 + idade3 + idade4) / 4;
		
		if(media < 25){
		    System.out.println(media + " Turma Jovem");
		}else if(media >= 25 && media <= 40 ){
		    System.out.println(media +" Turma Adulta");
		}else if(media > 40){
		    System.out.println(media +" Turma Idosa");
		}
	}
}
