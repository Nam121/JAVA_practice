import java.util.Scanner;

class SumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int rev = 0;
        int sum = 0;

	while (num != 0) {
	    	int remainder = num % 10;
	    	rev = rev * 10 + remainder;
	    	sum += remainder;
	    	num /= 10;
	}

        
        System.out.println("Rev Num - " + rev);
        System.out.println("Sum - " + sum);
        
     
    }
}

