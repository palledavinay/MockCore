package in.ineuron.main;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number: ");
		int num=scan.nextInt();
		if(num>0) {
			System.out.println("positive number");
		}else if(num==0) {
			System.out.println("zero");
			
		}else {
			System.out.println("negative number");
		}

	}

}
