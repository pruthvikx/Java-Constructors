public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Defult name ", 0.0 , "Default mail");
        System.out.println("Constructor 1 is called");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name , creditLimit, "unknown");
        System.out.println("Construsctor 2 is called");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println("Constructor 3 is called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }



}
