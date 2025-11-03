abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        setAccountNumber(accountNumber);
        setHolderName(holderName);
        setBalance(balance);
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) throw new IllegalArgumentException("Invalid account number");
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        if (holderName == null || holderName.trim().isEmpty()) throw new IllegalArgumentException("Invalid holder name");
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // annual rate in percent

    public SavingsAccount(String accNo, String holder, double balance, double interestRate) {
        super(accNo, holder, balance);
        setInterestRate(interestRate);
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 0) throw new IllegalArgumentException("Interest cannot be negative");
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return (getBalance() * interestRate) / 100.0;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // simple rule: savings holders can apply if balance >= 0.2 * amount
        return getBalance() >= 0.2 * amount;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // simplistic multiplier
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accNo, String holder, double balance, double overdraftLimit) {
        super(accNo, holder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // typically current accounts don't earn interest
    }

    @Override
    public boolean applyForLoan(double amount) {
        // simple rule: current account holders with overdraft can apply
        return amount <= overdraftLimit * 10;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }
}
