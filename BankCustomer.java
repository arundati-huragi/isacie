class Bank {
    private String cname;
    private String cAccNumber;
    private int cage;


    public Bank(String cname, String cAccNumber, int cage) {
        this.cname = cname;
        this.cAccNumber = cAccNumber;
        this.cage = cage;
    }
    public void display(){
        System.out.println("coustmer name\n"+cname);
        System.out.println("coustmer name\n"+cAccNumber);
        System.out.println("coustmer name\n"+cage);
    }
}
public class BankCustomer {
    public static void main(String[] args) {
        Bank b = new Bank("Sneha", "24345", 20); // Correct instantiation
        b.display();
    }
}
