package Bank;

public class BankAccount {
    
    //Tao so du tai khoan
    private double balance;

    //Contructor
    public BankAccount() {
        balance = 0;
    }

    //Nap tien
    public void deposit (double amount) {
        System.out.println("Đang nạp tiền:...");
        double balance = this.balance + amount;
        System.out.println("Đã nạp: " + balance);
        this.balance = balance;
    }

    //Rut tien
    public void withdraw(double amount) {
        System.out.println("Đang trừ tiền:...");
        double balance = this.balance + amount;
        System.out.println("Đã trừ tiền: " + balance);
        this.balance = balance;
    }

    //Show so du tk
    public double getBalance() {
        return this.balance;
    }
}
