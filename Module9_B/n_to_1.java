package MODULE9_B;
import java.util.Scanner;
public class n_to_1 {
    public static void printNumbers(int n) {
            if (n == 0) {   // base case
                return;
            }

            System.out.print(n + " ");
            printNumbers(n - 1);  // recursive call
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter n: ");
            int n = sc.nextInt();

            printNumbers(n);


        }
    }

