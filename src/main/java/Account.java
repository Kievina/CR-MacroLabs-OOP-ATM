public abstract class Account {

    private Integer accountNum;
    private Double balance;     // amount in account
    private char accountType;

    public Account() {}
    public Account(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double getBalance() { return balance; }


    public void deposit(Double depositAmount) {
        Double balance = this.getBalance();
        balance = balance + depositAmount;
        this.setBalance(balance);
    }


    public void withdraw(Double withdrawalAmount) {
        Double balance = this.getBalance();
        balance = balance - withdrawalAmount;
        this.setBalance(balance);
    }

    //Transfer money between account types
    public void transfer(Account accountType, Double transferAmount)
    {
        this.setBalance(getBalance() - transferAmount);
        accountType.setBalance(accountType.getBalance() + transferAmount);
    }

    /*public String printTransactionHistory() {
        return "Here is your most recent transaction: ""

    }*/
}
