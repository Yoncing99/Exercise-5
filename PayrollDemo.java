import java.util.Scanner;
public class PayrollDemo {
    public static void main(String[] args){
        Employee em = new Employee();
        em.input();
        Payroll pay = new Payroll(em.grossPay,em.stateTax,em.federalTax);
        pay.printOutput();
    }
}

class Employee{
    double employeeID, grossPay, stateTax, federalTax;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your employee ID number: ");
        employeeID = sc.nextDouble();
        System.out.printf("Enter your Gross Pay         : RM ");
        grossPay = sc.nextDouble();
        System.out.printf("Enter your State Tax         : RM ");
        stateTax = sc.nextDouble();
        System.out.printf("Enter your Federal Tax       : RM ");
        federalTax = sc.nextDouble();
    }
}
class Payroll{
    private double grossPay, stateTax, federalTax, netPay;

    public Payroll(double grossPay,double stateTax,double federalTax){
        this.grossPay = grossPay;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
    }

    public double calculateNetPay(){
        return netPay = grossPay - stateTax - federalTax;
    }

    public void printOutput(){
        System.out.printf("\nNet pay is: RM %.2f", calculateNetPay());
    }
}