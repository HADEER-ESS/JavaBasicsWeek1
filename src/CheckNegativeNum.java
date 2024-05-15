import java.util.Scanner;

public class CheckNegativeNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a num");
        int num = input.nextInt();

        System.out.println(num > 0 ? "Positive" : "Negative");
    }
}
