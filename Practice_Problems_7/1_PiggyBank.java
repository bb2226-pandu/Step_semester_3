import java.util.Scanner;

class PiggyBank {

    private double savings;
    private final String id;

    PiggyBank(String id) {
        this.id = id;
        savings = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            savings += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= savings) {
            savings -= amount;
        } else {
            System.out.println("Withdrawal rejected");
        }
    }

    public double getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Piggy Bank ID: ");
        String id = sc.nextLine();

        PiggyBank pb = new PiggyBank(id);

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();

        pb.deposit(deposit);

        System.out.println("Savings = " + pb.getSavings());

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        pb.withdraw(withdraw);

        System.out.println("Final Savings = " + pb.getSavings());

        sc.close();
    }
}
