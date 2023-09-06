import java.util.Scanner;

class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 100;
        int[] stack = new int[max];
        int top = -1; 

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (top < max - 1) {
                        System.out.print("Enter a value to push");
                        int item = sc.nextInt();
			++top;
                        stack[top] = item;
                    } else {
                        System.out.println("Stack is full");
                    }
                    break;
                case 2:
                    if (top >= 0) {
                        int poppedValue = stack[top];
			top--;
                        System.out.println("Popped value: " + poppedValue);
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                case 3:
                    if (top >= 0) {
                        int peekedValue = stack[top];
                        System.out.println("Top value: " + peekedValue);
                    } else {
                        System.out.println("Stack is empty. Cannot peek.");
                    }
                    break;
                case 4:
                    if (top >= 0) {
                        System.out.println("Stack (top to bottom):");
                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exit program.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
                        
