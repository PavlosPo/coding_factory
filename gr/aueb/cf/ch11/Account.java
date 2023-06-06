package gr.aueb.cf.ch11;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    // Default Constructor
    public Account() {}

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public double getBalance() {
        return balance;
    }


    // Public API

    /**
     * Deposits a certain amount of money.
     *
     * @param amount
     *          The amount of money to be deposited.
     * @throws Exception
     *          if the amount is negative.
     */
    public void deposit(double amount) throws Exception{
        try {
            if (amount < 0) {
                throw new Exception("Negative amount exception");
            }

            this.balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    /**
     * Withdraws an amount of money from an account.
     *
     * @param amount
     *          The amount to be withdrawn.
     * @param ssn
     *          the given ssn
     * @throws Exception
     *          if the ssn is not valid or the balance insufficient.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("SSN not valid exception");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance exception");
            }

            this.balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the account.
     *
     * @return
     *          the account's balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns the account's state in String format.
     *
     * @return
     *      The string-representation of the state of the account.
     */
    public String accountToString() {
        // Επιστρέφουμε το state του λογαριασμού της κλάσης.
        return "(" + id + ", " + iban + ", " + firstname + ", " +
        lastname + ", " + ssn + ", " + balance + ")";
    }


    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
