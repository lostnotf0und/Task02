package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a;
		int b;

		System.out.print("������� ����� �����: ");
		a = sc.nextInt();

		System.out.print("������� ��� ���� ����� �����: ");
		b = sc.nextInt();

		a = a + b;

		System.out.println("����� ��������� �����: " + a);

	}

}
