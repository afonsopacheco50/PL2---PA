import java.util.ArrayList;

/*
* This class represents */
public class Client {
    private String name;
    private int age;
    private int nChildren;
    private double debt;

    private ArrayList <Account> accounts = new ArrayList<>();
    public Client(String name, int age, int nChildren, double debt) {
        this.name = name;
        this.age = age;
        this.nChildren = nChildren;
        this.debt = debt;
    }

    /**
     * Gets the name of the Client
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Client
     * @param name of the client
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the Client
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the number of children
     * @return
     */
    public int getnChildren() {
        return nChildren;
    }

    /**
     * Gets the debt of the client
     * @return
     */
    public double getDebt() {
        return debt;
    }

    /**
     * Sets the age of the client
     * @param age of the client
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void setnChildren(int nChildren) {
        this.nChildren = nChildren;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public boolean addAccount(Account... accounts) {
        for (Account account: accounts) {
            if (! this.accounts.contains(account)) {
                this.accounts.add(account);
            } else {
                throw new ArrayStoreException("This account is already associated.");
            }
        }
        return true;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
