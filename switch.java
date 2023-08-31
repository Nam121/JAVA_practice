import java.util.Scanner;


class DaysInMonth {

    	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        
		System.out.print("Enter the year: ");
       
	       	int year = scanner.nextInt();
	

		System.out.print("Enter the month (1-12): ");
       
	       	int month = scanner.nextInt();


		int days = 0;


		if (month >= 1 && month <= 12) {
        
		    	if (month == 2) {
               
			       	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            
					days = 29;

				} else {

		    			days = 28;

				}

	    		} else if (month == 4 || month == 6 || month == 9 || month == 11) {

				days= 30;

	    		} else {

				days= 31;

	    		}


	    		System.out.println("Number of days in the specified month: " + days);

		} else {

	    		System.out.println("Invalid month value. Month must be between 1 and 12.");

		}      
   
       	}
}

