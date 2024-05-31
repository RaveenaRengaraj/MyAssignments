package myassignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int [] array = {1,4,3,2,8,6,7};
		Arrays.sort(array);
		for(int i=1;i<=array.length;i++) {
			if(array[i-1] !=i) {
			
				System.out.println("missing number : " + i);
				break;
			}
		}
	}
}
