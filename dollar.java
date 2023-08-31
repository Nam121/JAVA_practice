import java.util.Scanner;

class Dollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount in dollars: ");
        double dollars = scanner.nextDouble();
        
        double rupees = dollars * 82.65;
        
        System.out.println(dollars + " Dollars is equal to " + rupees + " Rupees.");
        
        scanner.close();
    }
}

