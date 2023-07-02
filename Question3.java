package in.ineuron.main;

public class Question3 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int sum=0;
		int i=0;
		do {
			sum=sum+arr[i];
			i++;
		}while(i<arr.length);
		double average=sum/arr.length;
		System.out.println(average);
	}

}
