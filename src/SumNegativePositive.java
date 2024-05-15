class SumNegativePositive {
    
     static int sumPositiveNum ;
     static int sumNegativeNum ;
    
    
    static public void sumPositive(int num){
        sumPositiveNum += num;
    }
    static public void sumNegative(int num){
        sumNegativeNum += num;
    }

    static public void displayInfo(){
        System.out.println("Sum of negative numbers " + sumNegativeNum + "\n Sum of positive numbers " + sumPositiveNum );
    }
}
