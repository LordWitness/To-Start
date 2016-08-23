import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int idade = 0, i = 1;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a idade do individuo N°1: ");
		idade = scanner.nextInt();

		while (idade != 0) {
			i++;
			System.out.print("Digite a idade do individuo N°" + i + ": ");
			idade = scanner.nextInt();
			idade += idade;
			System.out.println(idade);
		}
		System.out.println("A idade média desse grupo é: " + idade + " anos");
	}

}
