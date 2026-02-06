import java.util.Scanner;
public class powerOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
