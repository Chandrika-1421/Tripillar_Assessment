package MODULE9_B;
import java.util.Scanner;
public class PowerOfNo {
    public static int power(int a, int b) {
            if (b == 0) {   // base case
                return 1;
            }
            return a * power(a, b - 1);  // recursive call
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter base (a): ");
            int a = sc.nextInt();

            System.out.print("Enter exponent (b): ");
            int b = sc.nextInt();

            int result = power(a, b);
            System.out.println("Result = " + result);

        }
    }

