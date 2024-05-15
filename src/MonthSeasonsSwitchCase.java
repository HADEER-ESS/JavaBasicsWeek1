import java.util.Scanner;

public class MonthSeasonsSwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month number ");
        int month = input.nextInt();

        switch (month){
            case 1 :
                System.out.println("Jan \nWinter");
                break;
            case 2 :
                System.out.println("Feb \nWinter");
                break;
            case 3 :
                System.out.println("March \nSpring");
                break;
            case 4 :
                System.out.println("April \nSpring");
                break;
            case 5 :
                System.out.println("May \nSpring");
                break;
            case 6 :
                System.out.println("Jun \nSummer");
                break;
            case 7 :
                System.out.println("July \nSummer");
                break;
            case 8 :
                System.out.println("Aug \nSummer");
                break;
            case 9 :
                System.out.println("Sep \nAutumn");
                break;
            case 10 :
                System.out.println("Oct \nAutumn");
                break;
            case 11 :
                System.out.println("Nov \nAutumn");
                break;
            case 12 :
                System.out.println("Dec \nWinter");
                break;
            default:
                System.out.println("The Month you enter is out of range");
                break;
        }
    }

}
