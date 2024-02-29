import java.util.Arrays;
import java.util.Scanner;

public class Essay {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a essay: ");
        String your_essay = inputScanner.nextLine();

        System.out.println("Enter your word: ");
        String your_word = inputScanner.nextLine();

        String[] arry_essay = your_essay.split(" ");
        int word_number =0;
        for(String i : arry_essay){
            if (i.equals(your_word)){
                word_number = word_number + 1;
            }
        }
        System.out.println(your_word +" "+ " appeared " + word_number +" " + "times");
//        System.out.println(Arrays.toString(arry_essay));
    }
}