import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor pra a: "); 
		a = scanner.nextInt();
		
		System.out.print("Digite um valor pra b: ");
		b = scanner.nextInt();
		
		if(a > b){
			System.out.println(a);
			System.out.println(b);
		}else{
			System.out.print("Não é");
		}
	}

}
