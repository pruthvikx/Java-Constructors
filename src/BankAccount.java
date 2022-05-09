public class BankAccount {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){

        this("Sbi123",0.21,"Defualt name ","Default adress",
                "Default number" );
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFund(double fund){
        this.balance += fund;
        System.out.println("New balance after deposit = " + this.balance);
    }
    public void withdrawFund(double withdraw){
        if (this.balance - withdraw < 0){
            System.out.println("Insufficient balance");
        }else {
           this.balance = this.balance - withdraw;
            System.out.println("withdrawal of " + withdraw + " processed . Remaining " +
                    "balance = " + this.balance);
        }

    }

}
