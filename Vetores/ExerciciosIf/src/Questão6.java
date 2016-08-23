import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		int salario; 
		double desconto;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade do seu salário");
		salario = scanner.nextInt();
		
		if(salario < 200){ 
			desconto = 0.8;
		}
		if(salario >= 200&& salario < 500){ 
			desconto = 0.85;
		}
		if(salario >= 500&& salario < 1000){ 
			desconto = 0.9;
		}
		if(salario > 1000){
			desconto = 0.95;
		}
		
	}

}
