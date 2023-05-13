package Bank;

public class WithdrawRunnable implements Runnable {
    
    private BankAccount account;
    private double amount;
    private int count;
    private final int DELAY = 1;

    //Contructor
    public WithdrawRunnable(BankAccount account, double amount, int count) {
        this.account = account;
        this.amount = amount;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i=1; i <= count; i++)
            {
                account.withdraw(amount);
                Thread.sleep(DELAY);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
