import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        sc.close();
        int bill;
        if(units <= 100){
            bill = units * 2;
        } else if (units > 100 && units <= 200) {
            bill =  200 + (units - 100) * 3;
        } else {
            bill = 200 + 300 + (units - 200) * 5;
        }
        System.out.println(bill + 150);
    }
}
