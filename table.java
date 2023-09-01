import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int mul = scanner.nextInt();
        
        System.out.println("Mul Table for " + mul + ":");
        
        for (int i = 1; i <= 10; i++) {
            int result = mul * i;
            System.out.println(mul + " * " + i + " = " + result);
        }
        
       
    }
}

