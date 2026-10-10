import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int sum = 0, rev = 0;

        while (temp > 0) {
            int digit = temp % 10;

            sum += digit;
            rev = rev * 10 + digit;

            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + rev);
    }
}
