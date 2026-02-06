import java.util.Scanner;
public class salaryCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double basicSalary = sc.nextDouble();   // take basic Salary as input from user
        double HRA,DA,PF,netSalary = 0;
        sc.close();

        if(basicSalary >= 30000){
            HRA = (basicSalary * 0.20);         // HRA calculated as 20% of basic for salary above 30000
            DA = (basicSalary * 0.15);          // DA calculated as 15% of basic for salary above 30000
        } else {
            HRA = (basicSalary * 0.10);         // HRA calculated as 10% of basic for salary below 30000
            DA = (basicSalary * 0.08);          // DA calculated as 8% of basic for salary below 30000
        }
        PF = (basicSalary * 0.12);              // PF deduction 12% of basic salary
        netSalary =  basicSalary + HRA + DA - PF; // net salary
        System.out.println(netSalary);
    }
}
