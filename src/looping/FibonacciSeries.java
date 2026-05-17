package looping;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int no1 = 0 ;
		 int no2 = 1;
		 
		 System.out.print(no1 +" "+no2);
		 
		 int times =100;
		 
		 for(int i =1; i<=times; i++) {
			 
			 int sum = no1+no2;
			 System.out.print("," + sum);
			 
			 no1 = no2;
			 no2 = sum;
		 }
		 
	}

}
