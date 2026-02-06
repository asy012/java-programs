import java.util.Scanner;
public class SmartBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float itemPrice = sc.nextFloat();                           // take item price input from user
        int quantity = sc.nextInt();                                // take quantity of item from user
        sc.close();

        float price,discountedAmount = 0,GST,BillingAmount = 0;

        price = itemPrice * quantity;

        if(price >= 2000 && price < 5000){
            discountedAmount = (float) price - (price * 5)/100; // 5% discounted amount for price between 2000 and 5000
        } else if (price >= 2000) {
            discountedAmount = (float) price - (price * 10)/100; // 10% discounted amount for price above 5000
        } else{
            discountedAmount = (float) price;                    // no discount for price below 2000
        }
        GST = (float) (discountedAmount * 18)/100;               // 18% GST tax on discounted amount
        BillingAmount = (float) discountedAmount + GST;

        System.out.println(BillingAmount);                       // print the final bill amount
    }
}
