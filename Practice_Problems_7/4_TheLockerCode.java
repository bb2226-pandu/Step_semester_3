import java.util.Scanner;

class Locker {

    private String combination;
    private final int lockerNumber;

    Locker(int lockerNumber, String combination) {
        this.lockerNumber = lockerNumber;
        this.combination = combination;
    }

    public boolean changeCode(String oldCode, String newCode) {

        if (combination.equals(oldCode)) {
            combination = newCode;
            return true;
        }

        return false;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter locker number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter initial code: ");
        String code = sc.nextLine();

        Locker locker = new Locker(number, code);

        System.out.print("Enter current code: ");
        String oldCode = sc.nextLine();

        System.out.print("Enter new code: ");
        String newCode = sc.nextLine();

        boolean result = locker.changeCode(oldCode, newCode);

        if (result) {
            System.out.println("Code changed successfully");
        } else {
            System.out.println("Wrong current code. Code change rejected.");
        }

        sc.close();
    }
}
