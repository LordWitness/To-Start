import java.util.Scanner;

public class Quest�o2 {

	public static void main(String[] args) {
		 double numero;
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Digite um numero: ");
		 numero = scanner.nextDouble();
		 
		 if(numero % 2 == 0){
			 System.out.println("O numero " + numero + " � par");
		 }else{
			 System.out.println("O numero " + numero + " � impar");
		 }
		 

	}

}
