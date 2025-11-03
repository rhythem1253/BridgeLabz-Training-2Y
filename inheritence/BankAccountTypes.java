class BankAccount {
    int accountNumber;
    double balance;

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    @Override
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    @Override
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int duration;

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
