import java.util.Scanner;

public class Quest�o6 {

	public static void main(String[] args) {
		String vendedor;
		int carros, total, comiss�o;
		double porcvenda;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		vendedor = scanner.next();

		System.out.print("Digite o numero de carros vendidos nesse m�s: ");
		carros = scanner.nextInt();

		System.out.print("Digite o valor total das vendas: ");
		total = scanner.nextInt();

		comiss�o = (50 * carros);
		porcvenda = (0.5 * total);

		System.out.println("O seu sal�rio desse m�s � de: R$" + (500 + comiss�o + porcvenda));

	}

}
