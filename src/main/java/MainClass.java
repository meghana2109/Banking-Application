
public class MainClass {
    public static void main(String[] args) {
        Customer c1 = new Customer(001,"Meghana","M","Jayanagar",12345);
        Customer c2 = new Customer(002,"Pawan","Kumar","Vidyaranyapura",11223);
        Account a1 = new Account(001,12345,"Savings",32000);
        Account a2 = new Account(002,54321,"Loan",1000);
        Account a3 = new Account(003,11223,"Savings",21000);

        System.out.println("Customer 1 Details : ");
        System.out.println("Name : "+c1.firstName+ " "+c1.lastName);
        System.out.println("Account Number : "+c1.accountNumber);
        System.out.println("Account type : "+ a1.accountType);

        System.out.println("==========================================");

        System.out.println("Customer 2 Details : ");
        System.out.println("Name : "+c2.firstName+ " "+c2.lastName);
        System.out.println("Account Number : "+c2.accountNumber);
        System.out.println("Account type : "+ a3.accountType);

        System.out.println("==========================================");

        Transaction t1 = new Transaction(1,12345,"Debit","2022-12-12",2000 );
        Transaction t2 = new Transaction(2,11223,"Credit","2023-01-05",5000);

        System.out.println("Transaction Details : ");
        System.out.println(t1.transactionId+ " | "+t1.accountNumber+ " | "+t1.transactionType+ " | "+t1.amount + " | "+t1.date);
        System.out.println(t2.transactionId+ " | "+t2.accountNumber+ " | "+t2.transactionType+ " | "+t2.amount + " | "+t2.date);

    }
}
