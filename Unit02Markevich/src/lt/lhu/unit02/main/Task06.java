package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double d;
		double result;

		System.out.print("������� �������� ���������� a: ");
		a = sc.nextDouble();
		
		System.out.print("������� �������� ���������� b: ");
		b = sc.nextDouble();
		
		System.out.print("������� �������� ���������� c: ");
		c = sc.nextDouble();
		
		System.out.print("������� �������� ���������� d: ");
		d = sc.nextDouble();
		
		result=(a/c)*(b/d)-(a*b-c)/(c*d);
		
		System.out.println("�������� ��������� = " + result);
		
		
	}

}
