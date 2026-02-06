import java.util.Scanner;
public class NumberClassification {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num >= 0){
            System.out.println(num + " is Positive Number");
        } else {
            System.out.println(num + " is Negative Number");
        }
        if(num % 2 == 0){
            System.out.println(num + " is Even Number");
        } else{
            System.out.println(num + " is Odd Number");
        }
        System.out.println(
                (num % 5 == 0) ?
                        ((num % 7 == 0) ? num + " is divisible by both" : num + " is not divisible by both" )
                        : num +" is not divisible");
    }
}
