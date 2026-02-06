import java.util.Scanner;
public class maxNumWithoutComparison {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int diff = num1 - num2;

        int k = (diff >> 31) & 1;

        int max = num1 - k * diff;

        System.out.println("Maximum number is " + max);
    }
}
