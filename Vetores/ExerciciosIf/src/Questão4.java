import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		double a, b, c;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um valor pro lado *A* do triangulo: ");
		a = scanner.nextDouble();

		System.out.print("Digite um valor pro lado *B* do triangulo: ");
		b = scanner.nextDouble();

		System.out.print("Digite um valor pro lado *C* do triangulo: ");
		c = scanner.nextDouble();

		// Para os valores serem validos para um triangulo, devem estabelecer
		// essas três regras:
		// 1) a + b > c
		// 2) a + c > b
		// 3) b + c > a
		// No codigo, botei um if pra cada regra (um dentro do outro pra
		// funcionar como um algoritimo de etapas)

		// Dentro do "if" da ultima regra (numero 3) botei um algoritmo para
		// classificar os triangulos:
		// Para o triangulo ser Equilátero precisa ter todos os lados iguais
		// Para o triangulo ser Escaleno precisa ter todos os lados diferentes
		// Para o triangulo ser Isosceles precisa ter pelo menos 2 lados iguais
		if (a + b > c) {
			if (a + c > b) {
				if (b + c > a) {
					System.out.println("Podem ser lados de um triangulo");

					if (a == b && b == c) {
						System.out.println("Esse triangulo é Equilátero");

					} else {
						if (a != b && b != c && c != a) {
							System.out.println("Esse triangulo é Escaleno");
						} else {
							System.out.println("Esse triangulo é Isosceles");
						}
					}

				} else {
					System.out.print("Não podem ser lados de um triangulo");
				}
			} else {
				System.out.print("Não podem ser lados de um triangulo");
			}

		} else {
			System.out.print("Não podem ser lados de um triangulo");
		}
	}
}