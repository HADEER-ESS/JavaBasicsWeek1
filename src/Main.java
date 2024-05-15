import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Q3
//        System.out.println("Enter Watermelon weight ");
//        int watermelonWeight = input.nextInt();
//
//        Watermelon.isEven(watermelonWeight);


        //Q4
//        float flo1 = input.nextFloat();
//        float flo2 = input.nextFloat();
//        float flo3 = input.nextFloat();
//        SortFloat.sortItems(flo1 , flo2 , flo3);


        //Q5
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//        MinAndMax.minMax(num1 , num2 , num3);


        //Q6 6-what is the value of x,y,z and w
        /*
        intx=3;
        inty=2;
        intz=X++;
        intw=++Y;

        z = 3
        w = 2
        y = 3
        x = 4
         */

        /*Q7
        int count = 0;

        while(true){
            int num = input.nextInt();

            if(num >= 0){
                SumNegativePositive.sumPositive(num);
                count ++;
            }
            else{
                SumNegativePositive.sumNegative(num);
                count++;
            }
            if(count == 6){
                SumNegativePositive.displayInfo();
                return;
            }
        }
*/


        /*Q8

        int count = 0;

        while(true){

            int num = input.nextInt();
            count++;
            GreatestNumber.checkGreatestNumber(num);


            if(count == 3) {
                System.out.println("The greatest number is " + GreatestNumber.getNumber());
                return;
            }
        }
*/

        /*Q9

        double circleRadius = input.nextDouble();
        System.out.println("Circle Radius is " + Circle.circleArea(circleRadius));
*/

        /*Sessions Problems*/
        //Factorial
//        int sum = 1;
//        int fac = input.nextInt();
//        for(int i=fac ; i> 0; i--){
//            sum *= i;
//        }
//        System.out.println(sum);

        //Prime Number
//        int num = input.nextInt();
//        for(int i = num ; i>1 ; i--){
//            if( num % i == 0 ){
//                System.out.println( i +"  ,is prime");
//            }else{
//                System.out.println(i + "  ,not a prime");
//            }
//        }

        //Reverse Number
//        int num = input.nextInt();
//        int reversedNum = 0;
//
//        while(num != 0){
//            reversedNum *= 10;
//            reversedNum += num % 10;
//            num /= 10;
//        }
//        System.out.println(reversedNum);

    }
}