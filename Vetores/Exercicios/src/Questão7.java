import java.util.Scanner;

public class Quest�o7 {

	public static void main(String[] args) {
		double x, z, w, y, h;
		double Area1, Area2, Area3;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a dimens�o de x: ");
		x = scanner.nextDouble();

		System.out.print("Digite a dimens�o de z: ");
		z = scanner.nextDouble();

		System.out.print("Digite a dimens�o de w: ");
		w = scanner.nextDouble();

		System.out.print("Digite a dimens�o de y: ");
		y = scanner.nextDouble();

		System.out.print("Digite a dimens�o de h: ");
		h = scanner.nextDouble();

		Area1 = ((w + x) * h) / 2;
		Area2 = (z * y) / 2;
		Area3 = (x * y);

		System.out.print("A �rea total da sala � de: " + (Area1 + Area2 + Area3));

	}

}
