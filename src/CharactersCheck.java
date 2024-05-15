import java.util.Scanner;

public class CharactersCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character  ");

        char character = Character.toLowerCase(input.nextLine().charAt(0)) ;
        int isChar  = Integer.valueOf(character);
        if(isChar >= 65 && isChar <= 90 || isChar >= 97 && isChar <= 122){

            if(character == 'i' ||
                    character == 'o' ||
                    character == 'e' ||
                    character == 'u' ||
                    character == 'a'){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }else{
            System.out.println("Please enter a character");
        }

    }
}
