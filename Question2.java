package in.ineuron.main;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number: ");
		int num=scan.nextInt();
		int first=0;
		int second=1;
		for(int i=0;i<=num;i++) {
			System.out.println(first);
			int temp=first+second;
			first=second;
			second=temp;
		}

	}

}
