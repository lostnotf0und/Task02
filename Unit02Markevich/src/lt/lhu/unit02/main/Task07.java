package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;

		System.out.print("¬ведите число a: ");
		a = sc.nextDouble();

		System.out.print("¬ведите число b: ");
		b = sc.nextDouble();

		System.out.print("¬ведите число c: ");
		c = sc.nextDouble();

		if (a >= 0) {
			a = Math.pow(a, 2);
		} else {
			a = Math.pow(a, 4);
		}

		if (b >= 0) {
			b = Math.pow(b, 2);
		} else {
			b = Math.pow(b, 4);
		}

		if (c >= 0) {
			c = Math.pow(c, 2);
		} else {
			c = Math.pow(c, 4);
		}

		System.out.println(a + ", " + b + ", " + c);

	}

}
