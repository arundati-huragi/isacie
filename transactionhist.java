class transact {
    private String tid;
    private String sname;
    private String rname;
    private double amount;
    private String status;
    private String tdate;

    public transact(String tid, String sname, String rname, double amount, String status, String tdate) {
        this.tid = tid;
        this.sname = sname;
        this.rname = rname;
        this.amount = amount;
        this.status = status;
        this.tdate = tdate;
    }

    public void displayDetails() {
        System.out.println("Transaction ID: " + tid);
        System.out.println("Sender Name: " + sname);
        System.out.println("Receiver Name: " + rname);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
        System.out.println("Transaction Date: " + tdate);
    }
}

public class transactionhist {
    public static void main(String[] args) {
     
        transact t = new transact("1245", "Sneha", "Rahul", 5000.0, "Completed", "24-04-2025");
       
        t.displayDetails();
    }
}
