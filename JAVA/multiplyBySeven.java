import java.util.Scanner;
public class multiplyBySeven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        int result = num << 3;

        int a = result;
        int b = num;

        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }

        result = a;

        System.out.println(result);
    }
}
