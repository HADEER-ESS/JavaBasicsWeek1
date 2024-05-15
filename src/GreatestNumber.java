public class GreatestNumber {

    private static int number;

    static public  void checkGreatestNumber (int num){

        if(number < num){
            number = num;
        }
    }

    static public int getNumber(){
        return  number;
    }
}
