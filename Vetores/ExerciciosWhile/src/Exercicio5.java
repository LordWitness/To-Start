import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int i = 1, soma = 1, fatorial;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um valor pra achar sua fatorial: ");
		fatorial = scanner.nextInt();

		while (i < (fatorial + 1)) {
			soma = soma * i;
			i++;

		}
		System.out.println("O fatorial de " + fatorial + " é: " + soma);
	}

}
