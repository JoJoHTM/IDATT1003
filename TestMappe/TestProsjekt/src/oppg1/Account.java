package oppg1;
import java.util.Objects;
import static javax.swing.JOptionPane.*;


public class Account {
    long accountnr;
    String name;
    double saldo;

    public Account(long accountnr, String name, double saldo){
        this.accountnr = accountnr;
        this.name = name;
        this.saldo = saldo;
    }

    public long getAccountnr(){
        return accountnr;
    }

    public String getName(){
        return name;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setAccountnr(long accountnr){
        this.accountnr = accountnr;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void add(double amount){
        saldo += amount;
    }

    public void withdraw(double amount){
        saldo -= amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountnr == account.accountnr&&
                Double.compare(account.saldo, saldo) == 0 &&
                Objects.equals(name, account.name);
    }
    @Override
    public String toString() {
        return "Account{" +
                "accountnr=" + accountnr +
                ", name='" + name + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
