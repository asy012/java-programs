import java.util.Scanner;
public class multiWithoutOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int result = 0;

        while (num2 != 0) {
            if ((num2 & 1) == 1) {

                int a = result;
                int b = num1;

                while (b != 0) {
                    int carry = a & b;
                    int sum = a ^ b;
                    a = sum;
                    b = carry << 1;
                }
                result = a;
            }

            num1 = num1 << 1;
            num2 = num2 >> 1;
        }

        System.out.println(result);
    }
}
