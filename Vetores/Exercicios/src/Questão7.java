import java.util.Scanner;

public class Questão7 {

	public static void main(String[] args) {
		double x, z, w, y, h;
		double Area1, Area2, Area3;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a dimensão de x: ");
		x = scanner.nextDouble();

		System.out.print("Digite a dimensão de z: ");
		z = scanner.nextDouble();

		System.out.print("Digite a dimensão de w: ");
		w = scanner.nextDouble();

		System.out.print("Digite a dimensão de y: ");
		y = scanner.nextDouble();

		System.out.print("Digite a dimensão de h: ");
		h = scanner.nextDouble();

		Area1 = ((w + x) * h) / 2;
		Area2 = (z * y) / 2;
		Area3 = (x * y);

		System.out.print("A área total da sala é de: " + (Area1 + Area2 + Area3));

	}

}
