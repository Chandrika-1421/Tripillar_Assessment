package MODULE8_B;
import java.util.*;
    public class ReverseEachWorrd {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            String[] words = sentence.split(" ");
            String result = "";

            for (String word : words) {
                String reversed = "";

                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);
                }

                result += reversed + " ";
            }

            System.out.println("Output: " + result.trim());
        }
    }

