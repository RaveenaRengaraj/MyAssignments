package myassignments;

public class Palindrome {

	public static void main(String[] args) {
		int input = 121;
        int output = 0;
        int temp = input;
        
        while (temp != 0) {    
            int digit = temp % 10; 
            output = output * 10 + digit; 
            temp /= 10;
        }

      
        if (input == output) {
            System.out.println(input + " It's a Palindrome");
        } else {
            System.out.println(input + "It's not a Palindrome");
        }

	}

}
