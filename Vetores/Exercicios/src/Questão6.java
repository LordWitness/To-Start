import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		String vendedor;
		int carros, total, comissão;
		double porcvenda;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		vendedor = scanner.next();

		System.out.print("Digite o numero de carros vendidos nesse mês: ");
		carros = scanner.nextInt();

		System.out.print("Digite o valor total das vendas: ");
		total = scanner.nextInt();

		comissão = (50 * carros);
		porcvenda = (0.5 * total);

		System.out.println("O seu salário desse mês é de: R$" + (500 + comissão + porcvenda));

	}

}
