package Bank;

public class BankAccountThreadRunnable {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        final double AMOUNT = 100;
        final int REPETTIONS = 100;
        final int THREAD = 100;

        for (int i=1; i <= THREAD; i++) {
            
            DepositRunnable d = new DepositRunnable(account, AMOUNT, REPETTIONS);
            WithdrawRunnable w = new WithdrawRunnable(account, AMOUNT, REPETTIONS);

            Thread dt = new Thread(d);
            Thread wt = new Thread(w);

            dt.start();
            wt.start();
        }
        
    }

    
}