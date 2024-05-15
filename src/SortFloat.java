public class SortFloat {
    
    static public void sortItems(float a , float b, float c){
        
        if(a > b && a > c && b > c){ //1-a   2-b  3-c
            System.out.printf("%f \n %f \n %f" , a , b , c);
        }
        if(a > b && a > c && c > b){
            System.out.printf("%f \n %f \n %f" , a , c , b);
        }
        if(b > a && b > c && a > c){ //1-b   2-a  3-c
            System.out.printf("%f \n %f \n %f"  , b , a , c);
        }
        if(b > a && b > c && c > a){
            System.out.printf("%f \n %f \n %f"  , b , c , a);
        }
        if(c > a && c > b && b > a ){
            System.out.printf("%f \n %f \n %f"  , c , b , a);
        }
        if(c > a && c > b && a> b){
            System.out.printf("%f \n %f \n %f"  , c , a , b);
        }
    }
}
