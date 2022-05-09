public class Main {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Pruthvi",2000);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Zora", 150,"zora@mana");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());

    }
}
