 class SwapWithoutVariable {

     	 public static void main(String[] args) {
     
	      	 int x = 5;        
		 
		 int y = 10;
        
	        x = x + y;
	        y = x - y;
	        x = x - y;
        
	        System.out.println("x after swapping: " + x);
	
		System.out.println("y after swapping: " + y);
    }
}

