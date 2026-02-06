import java.util.Scanner;

public class MenuDrivenCalculator{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        float num1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        float num2 = sc.nextFloat();
        System.out.println("For add click 1 \nFor substract click 2 \nFor multiply click 3 \nFor divide click 4 \nFor modulus click 5");
        int operator = sc.nextInt();
        sc.close();

        switch(operator){
            case 1 : System.out.println(num1 + num2);
                break;

            case 2 : System.out.println(num1 - num2);
                break;

            case 3 : System.out.println(num1 * num2);
                break;

            case 4 : if(num2 == 0){
                System.out.println("Infinite");
            } else{
                System.out.println(num1 / num2);
            }
                break;

            case 5 : if(num2 == 0){
                System.out.println("Infinite");
            }else {
                System.out.println(num1 % num2);
            }
                break;

            default: System.out.println("Inavalid Operator");
        }
    }
}
