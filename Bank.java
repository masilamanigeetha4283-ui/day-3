import java.util.Scanner;

class Account{
    private int accountNumber;
    String accountHolderName;
    double balance;
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
}
public class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account b = new Account();
        System.out.println("enter Account Number:");
        int acc=sc.nextInt();
        b.setAccountNumber(acc);
        sc.nextLine();
        System.out.println("enter Account Holder Name");
        b.accountHolderName=sc.nextLine();
        System.out.println("enter Balance");
        b.balance=sc.nextDouble();
        System.out.println("\nOriginal Account Details");
        System.out.println("Account Number:"+b.getAccountNumber());
        System.out.println("Account Holder:"+b.accountHolderName);
        System.out.println("Balance:"+b.balance);
        System.out.println("\nenter new Account Number");
        int newAcc=sc.nextInt();
        b.setAccountNumber(newAcc);
        System.out.println("\nUpdate Account Details:");
        System.out.println("Account Number:"+b.getAccountNumber());
        System.out.println("Account Holder:"+b.accountHolderName);
        System.out.println("Balance:"+b.balance);
        sc.close();
    }    
}
