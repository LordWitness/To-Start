import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		double num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		num1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		num2 = scanner.nextDouble();
		
		if(num1==num2){
			System.out.print("Esses numeros são iguais");
			
		}else{
			System.out.print("Esses numeros são diferentes");
		}
		
		
		
		
	}

}
