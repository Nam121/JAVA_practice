import java.util.Scanner;

class LinearSearch {
    	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		System.out.print("enter length of array: ");
        
		int length = sc.nextInt();
        
		int[] arr = new int[length];
        
		System.out.println("enter " + length + " numbers:");
        
		for (int i = 0; i < length; i++) {
       
		   	arr[i] = sc.nextInt();

		}

		System.out.print("enter num we gotto search: ");
       
	       	int x = sc.nextInt();

		int position = -1;
       
	       	for (int i = 0; i < length; i++) {

	    		if (arr[i] == x) {
  
		  		position = i + 1;

				break;

	    		}

		}

		if (position != -1) {

	    		System.out.println(x + " is present in the array at position " + position);

		} else {

	    		System.out.println(x + " is not present in the array.");

		}

		sc.close();
    }
}

