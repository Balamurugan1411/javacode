class BankAccount{
    private double balance;
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }
}

public class encap {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setBalance(1000);
        System.out.println(b.getBalance());
    }
}
