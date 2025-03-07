package ATM;
import java.util.Scanner;
public class ATM {
    private BankAccount acc;
    private Scanner in;

    public ATM(BankAccount acc) {
        this.acc = acc;
        this.in = new Scanner(System.in);
        }

    public void menu() {
        System.out.println("\n Welcome to the ATM !");
        System.out.println("1. Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check balance");
        System.out.println("4.Exit");
    }    

    public void deposit() {
        System.out.print("Enter an amount to deposit : ");
        double amount = in.nextDouble();
        if(acc.deposit(amount)){
            System.out.println("Amount deposited successfully : " + amount);
            System.out.println("Your new balance is : " + acc.checkbalance());
        } else {
            System.out.println("Deposit failed. Please try again");
                }
        }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = in.nextDouble();
        if(acc.withdraw(amount)) {
            System.out.println("Succesfully withdrew :" + amount );
            System.out.println("Your remaining balance is : " + acc.checkbalance());
        } else {
            System.out.println("Withdrawal failed might be insufficient balance");   
        }
    } 
    
    public void checkBalance() {
        double balance = acc.checkbalance();
        System.out.println("Your balance is : " + balance);
    }

public void run() {
    while (true) {
        menu();
        System.out.print("Please choose an option (1-4) : " );
        int choice = in.nextInt();

        switch(choice){
            case 1-> withdraw();
            case 2-> deposit();
            case 3-> checkBalance();
            case 4 -> {
                System.out.println("Thanks for using for our ATM !!!! GoodBye");
                in.close();
                return;
            }
            default -> {
                System.out.println("Invalid choice. Please try again");
            } 
        }
    }
}
}