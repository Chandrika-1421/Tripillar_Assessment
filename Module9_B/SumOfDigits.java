package MODULE9_B;
    import java.util.Scanner;
    public class SumOfDigits {
        public static int sum(int n) {
            if (n == 0) {   // base case
                return 0;
            }
            return (n % 10) + sum(n / 10);  // recursive case
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int result = sum(num);
            System.out.println("Sum of digits = " + result);
        }
    }

