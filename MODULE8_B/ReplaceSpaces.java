package MODULE8_B;
import java.util.*;
public class ReplaceSpaces {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            String result = str.replace(" ", "'%20'");

            System.out.println("Output: " + result);

        }
    }

