import java.util.Scanner;
public class addWithoutOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int sum;

        while (num2 != 0) {
            int carry = num1 & num2;
            sum = num1 ^ num2;

            num1 = sum;
            num2 = carry << 1;
        }

        System.out.println(num1);
    }
}
