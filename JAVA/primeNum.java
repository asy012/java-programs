import java.util.Scanner;
public class primeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        if(num1 < 0 && num2 < 0){
            System.out.println("no prime numbers");
            return;
        } else if (num1 > num2) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        for (int i = num1; i <= num2; i++){
            if (i > 1){
                boolean isPrime = true;

                for (int j = 2; j <= i / 2; j++){
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime){
                    System.out.println(i);
                }
            }
        }
    }
}
