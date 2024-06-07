class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected double interestRate;

    public BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}

class SavingsAccount extends BankAccount {
    private double minimumBalance;

    public SavingsAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Withdrawal amount exceeds minimum balance limit");
        } else {
            super.withdraw(amount);
        }
    }
}

class FixedDeposit extends SavingsAccount {
    private int term;

    public FixedDeposit(String accountNumber, double balance, double interestRate, double minimumBalance, int term) {
        super(accountNumber, balance, interestRate, minimumBalance);
        this.term = term;
    }

    public int getTerm() {
        return term;
    }
}

   class Main {
    public static void main(String[] args) {
       BankAccount b=new BankAccount("NU002", 0, 0.6);

        SavingsAccount s = new SavingsAccount("SA001", 0, 0.05, 100);

       
        b.deposit(1000);
        System.out.println("Current balance: " + b.balance); 
        s.deposit(2000);
        s.withdraw(500);
        System.out.println("Current balance: " + s.balance); 

       
        FixedDeposit fd = new FixedDeposit("FD001", 10000, 0.06, 5000, 12);
            fd.deposit(500);
            System.out.println("Current balance: " + fd.balance); 
        System.out.println("Term of Fixed Deposit: " + fd.getTerm()); 
    }

}
