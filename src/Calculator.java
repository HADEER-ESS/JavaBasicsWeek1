import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();
        input.nextLine();

        System.out.println("Enter the Operation");
        char operation = input.nextLine().charAt(0);

        System.out.println("Enter second number");
        int num2 = input.nextInt();
        input.nextLine();

        switch (operation){

            case '/':
                if (num2 == 0) {
                    System.out.println("Not valid");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Please enter a valid number");
        }
    }
}
