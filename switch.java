import java.util.Scanner;

class Days {

    	public static void main(String[] args) {
    
	    	Scanner scanner = new Scanner(System.in);

		System.out.print("enter year: ");

		int year = scanner.nextInt();


		System.out.print("enter month (1-12): ");

		int month = scanner.nextInt();
	

		int days = 0;

        
		switch (month) {

	    		case 2:

				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

		    			days = 29;

				} else {

		    			days = 28;

				}

				break;

	    		case 4: case 6: case 9: case 11:

				days = 30;

				break;

	    		default:

				days = 31;

				break;

		}


		if (month >= 1 && month <= 12) {

	    		System.out.println("Number of days: " + days);

		} else {

	    		System.out.println("Invalid month value.");

		}
    }
}

