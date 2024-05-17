
class ATM{

    synchronized public void checkBalance(String name){
        System.out.println("Checking balance for " + name);
        // Simulate some work
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); } // delays the thread so the other thread could try to enter
        System.out.println(name + "'s balance checked."); // The other thread does not enter because this is declared synchronized.
    }
    synchronized public void withDrawCash(String name, double Amount){
        System.out.println("Withdrawing cash for " + name);
        // Simulate some work
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("Cash withdrawn for " + name);
    }

}

class Customer extends Thread{
    String name; // creating a reference
    double amount;

    ATM a;
    Customer(ATM a, String name, double amount){
        this.a=a;
        this.name=name;
        this.amount=amount;
    }

    public void useATM(){
        a.checkBalance(name);
        a.withDrawCash(name,amount);
    }
     public void run(){
        useATM();
    }

}

public class SynchronizationATMChallenge {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer(atm,"Sai",1000);
        Customer c2 = new Customer(atm,"Praveen",2000);

        c1.start();
        System.out.println();
        c2.start();

    }

}
