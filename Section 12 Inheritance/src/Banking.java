/*
Account is a parent class
acc no
name
address
mobile
DOB
emailID
balance
get set for the above properties

SavingsAccount is a subclass
deposit()
withdraw()

LoanAccount is a subclass
payEMI()
foreclosure()
 */

import java.util.Random;

class Account{
    public String AccountNumber="";
    public String Name;
    private String Address;
    public long Mobile;

    public double Balance=0.0;

    public Account(){
        Random rand =new Random();
        for(int i=0;i<10;i++){
            int randomInt = rand.nextInt(10);
            AccountNumber = AccountNumber + String.valueOf(randomInt);
        }
    }



    public void setName(String CustName){
        Name=CustName;
    }

    public void setAddress(String CustAddress){
        Address=CustAddress;
    }

    public void setMobile(long CustMobile){
        Mobile=CustMobile;
    }

    public void Deposit(double transationamount){
        Balance = Balance + transationamount;
    }

    public void Withdraw(double transationamount){
        Balance = Balance - transationamount;
    }


    public void getDetails(){
        System.out.println("AccNo: "+AccountNumber);
        System.out.println("Customer: "+Name);
        System.out.println("Address: "+Address);
        System.out.println("Mobile: "+Mobile);
        System.out.println("Balance: "+ Balance);

    }

}

class SavingsAccount extends Account{
    public void DepositSavings(double transationamount){
        Balance = Balance + transationamount;
    }

    public void WithdrawSavings(double transationamount){
        Balance = Balance - transationamount;
    }
}

class LoanAccount extends Account{

    public double loanAmount;

    public double ROI= 11;

    public int TenureInYears;
    public int TenureInMonths;

    public double EMI;
    public double SimpleInterest;

    public double OutstandingAmount;
    public void applyLoan(double amount,int tenure){
        loanAmount=amount;
        TenureInYears=tenure;
        TenureInMonths=TenureInYears*12;
        Balance = Balance + loanAmount;
        SimpleInterest = (loanAmount * TenureInYears * ROI)/100;
        EMI = (loanAmount + SimpleInterest)/12;
        OutstandingAmount = loanAmount + SimpleInterest;


        System.out.println("Loan granted..!!");
        System.out.println("Loan amount: "+loanAmount);
        System.out.println("EMI: "+EMI);
        System.out.println("Tenure: "+TenureInYears+" year(s)");
        System.out.println("Interest: "+SimpleInterest);
        System.out.println("Account balance: "+Balance);

    }



    public void payEMI(){
        Balance = Balance - EMI;

        TenureInMonths--;
        OutstandingAmount = OutstandingAmount - EMI;
        System.out.println("EMI: "+EMI+" Paid");
        System.out.println("Outstanding Amount: "+OutstandingAmount);
        System.out.println("Tenure Left: "+TenureInMonths+" month(s)");
        System.out.println("Account balance: "+Balance);

    }
}

public class Banking {

    public static void main(String[] args) {
//        SavingsAccount acc1 = new SavingsAccount();
//        acc1.setName("Sai praveen Seva");
//        acc1.setAddress("Ibrahimpatnam");
//        acc1.setMobile(995995819);
//        acc1.DepositSavings(10000.00);
//        acc1.WithdrawSavings(2500.00);
//        acc1.getDetails();

        LoanAccount acc2 = new LoanAccount();
        acc2.setName("Raja");
        acc2.setAddress("Ibrahimpatnam");
        acc2.setMobile(889777974);
        acc2.Deposit(12000.00);
        acc2.Withdraw(2000.00);
        acc2.getDetails();
        System.out.println();
        acc2.applyLoan(5000,1);
        System.out.println();
        acc2.payEMI();
        System.out.println();
        acc2.payEMI();
    }


}
