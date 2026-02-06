import java.util.Scanner;
public class QuotientWithoutDivision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        sc.close();

        if (divisor == 0) {
            System.out.println("Division not possible");
            return;
        }

        int quotient = 0;

        while (dividend >= divisor) {

            int num1 = dividend;
            int num2 = divisor;

            while (num2 != 0) {
                int borrow = (~num1) & num2;
                num1 = num1 ^ num2;
                num2 = borrow << 1;
            }

            dividend = num1;
            quotient++;
        }

        System.out.println(quotient);
    }
}
