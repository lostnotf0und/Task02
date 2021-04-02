package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;

		System.out.print("¬ведите число a: ");
		a = sc.nextDouble();

		System.out.print("¬ведите число b: ");
		b = sc.nextDouble();

		System.out.print("¬ведите число c: ");
		c = sc.nextDouble();

		d = Math.log(b * b - 1);

		d = a * a - (b - c) * (b - c) + d;

		System.out.println("«начение выражени€:" + d);

	}
}
