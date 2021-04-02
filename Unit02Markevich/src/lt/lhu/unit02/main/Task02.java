package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		double c; // площадь
		double a; // гипотенуза

		System.out.print("Давайте найдем площадь и гипотенузу прямоугольного треугольника! \n\n" + "Введите длинну его первого катета: ");
		x = sc.nextDouble();

		System.out.print("Введите длинну его второго катета: ");
		y = sc.nextDouble();

		c = x * y;
		c = c / 2;

		a = Math.sqrt(x * x + y * y);

		System.out.println("\nПлощадь прямоугольного треугольника: " + c + "; Гипотенуза прямоугольного треугольника: " + a);
	}

}
