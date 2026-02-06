import java.util.Scanner;
public class patternPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print(i);
            }
                for (int k = n; k > i; k--) {
                    System.out.print(" ");
                }
            System.out.println();
        }
    }
}
