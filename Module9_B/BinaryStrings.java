package MODULE9_B;
import java.util.Scanner;
public class BinaryStrings {
    public static void generate(String str, int n) {
            if (str.length() == n) {   // base case
                System.out.print(str+" ");
                return;
            }
            generate(str + "0", n);  // add 0
            generate(str + "1", n);  // add 1
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter n: ");
            int n = sc.nextInt();
            generate("", n);

        }
    }


