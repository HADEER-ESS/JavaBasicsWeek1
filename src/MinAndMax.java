public class MinAndMax {

    static public void minMax(int x , int y , int z){

        int max = x;

        if(max < y) max = y;

        if(max < z) max = z;

        int min = x;

        if(min > y) min = y;

        else if(min > z) min = z;

        System.out.printf("Max = %d \n Min = %d" , max , min);
    }
}
