package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		double c; // �������
		double a; // ����������

		System.out.print("������� ������ ������� � ���������� �������������� ������������! \n\n" + "������� ������ ��� ������� ������: ");
		x = sc.nextDouble();

		System.out.print("������� ������ ��� ������� ������: ");
		y = sc.nextDouble();

		c = x * y;
		c = c / 2;

		a = Math.sqrt(x * x + y * y);

		System.out.println("\n������� �������������� ������������: " + c + "; ���������� �������������� ������������: " + a);
	}

}
