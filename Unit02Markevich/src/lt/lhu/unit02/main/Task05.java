package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		d = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		d = (b + d) / (2 * a) - Math.pow(a, 3) * c + b;

		System.out.println("«начение выражени€: " + d);
	}

}
