import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        * if Grade A then marks >=80

if Grade B then marks >=60 and less than 80
if Grade C then marks >=40 and less than 60

if Grade F then marks <=40
        * */

        System.out.println("Enter your grade");
        int grade = input.nextInt();

        if(grade >= 80 && grade <= 100){
            System.out.println("A");
        }
        else if(grade >= 60 && grade < 80){
            System.out.println("B");
        }
        else if(grade >= 40 && grade < 60){
            System.out.println("C");
        }else if(grade < 40 && grade >= 0){
            System.out.println("F");
        }else{
            System.out.println("Invalid degree");
        }
    }
}
