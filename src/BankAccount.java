public class BankAccount {
    private int accountNumber;
    private String accountName;
    private int balance;
    private Date openingDate;



    public BankAccount(int accountNumber, String accountName, int balance, int day, int month, int year) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.openingDate = new Date(day, month, year);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }


    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        }
    }

    public void setAccountName(String accountName) {
        if (!accountName.isEmpty()) {
            this.accountName = accountName;
        }
    }

    public Date getOpeningDate() {
        Date newDob = new Date(openingDate.getDay(), openingDate.getMonth(), openingDate.getYear());
        return newDob;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void display() {
        System.out.println(" accountNumber :  " + accountNumber + " accountName : " + accountName + " balance : " + balance + " date : " + openingDate.getDay() + "-" + openingDate.getMonth() + "-" + openingDate.getYear());

    }

}
