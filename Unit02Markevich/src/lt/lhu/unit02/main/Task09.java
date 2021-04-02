package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double y;
		double x;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите значение х<=-3 или x>3: ");
		x = sc.nextDouble();

		while (x>-3 && x<=3) 
		{System.out.print("Вы ввели неверное значение. Введите значение х<=-3 или x>3: ");
		x = sc.nextDouble();
		}
		
		
		if(x <= -3) {
			y = 9;
		}else{
			y = 1 / (Math.pow(x, 2) + 1);
		} 
		System.out.println("F(x) = " + y);
		
	}

}
