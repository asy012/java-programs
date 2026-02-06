import java.util.Scanner;
public class subWithoutOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        num2 = ~num2;

        int carry = 1;
        while (carry != 0) {
            int temp = num2 ^ carry;
            carry = (num2 & carry) << 1;
            num2 = temp;
        }

        while (num2 != 0) {
            int carry2 = num1 & num2;
            int sum = num1 ^ num2;

            num1 = sum;
            num2 = carry2 << 1;
        }

        System.out.println(num1);
    }
}
