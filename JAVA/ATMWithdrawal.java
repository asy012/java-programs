import java.util.Scanner;
public class ATMWithdrawal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();

        int AcBalance = sc.nextInt();
        int withdrawMoney = sc.nextInt();

        if (withdrawMoney % 100 == 0 && (AcBalance - withdrawMoney) >= 1000) {
            System.out.println("Transaction Success");
        } else {
            System.out.println("Transaction Failed");
        }
    }
}