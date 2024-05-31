package myassignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int a = 19;
		int count =1;
		for(int i=2;i<a;i++) {
			if (a%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println(a +"is a prime number");
		}else {
			System.out.println(a +"is not a prime number");
			
		}
		
}
}
