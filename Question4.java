package in.ineuron.main;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter num1: ");
		int num1=scan.nextInt();
		System.out.println("please enter num2: ");
		int num2=scan.nextInt();
		System.out.println("please enter num3: ");
		int num3=scan.nextInt();
		if(num1>num2&&num1>num3) {
			System.out.println("num1 is greater");
		}else if(num2>num3) {
			System.out.println("num2 is greater");
		}else {
			System.out.println("num3 is greater");
		}

	}

}
