public abstract class Account {

    private Integer accountNum;
    private Double accountBalance;
    private char accountType;

    public Account(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountNum() {
        this.accountNum = userBank.returnNewAccountNum;
    }
}
