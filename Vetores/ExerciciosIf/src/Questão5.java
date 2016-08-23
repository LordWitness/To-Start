import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\tTeste de dois numeros multiplos");
		System.out.print("Digite o valor do primeiro numero: ");
		a = scanner.nextInt();
		System.out.print("Digite o valor do segundo numero: ");
		b = scanner.nextInt();
		
		if( a % b == 0){
			System.out.println("São multiplos");
		}else{
			System.out.println("Não são multiplos");
		}
	}

}
