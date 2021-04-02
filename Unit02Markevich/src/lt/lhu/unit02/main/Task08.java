package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double h;
		double y;

		System.out.print("¬ведите первое число отрезка: ");
		a = sc.nextDouble();
		System.out.print("¬ведите последнее число отрезка: ");
		b = sc.nextDouble();
		System.out.print("¬ведите шаг: ");
		h = sc.nextDouble();

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			y = 2 * (Math.tan(x / 2)) + 1;

			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
	}

}
