import java.util.Scanner;

class Cart {

    private final double[] prices;
    private final String cartId;
    private int count;

    Cart(String cartId, int size) {
        this.cartId = cartId;
        prices = new double[size];
        count = 0;
    }

    public void addItem(double price) {

        if (count < prices.length && price >= 0) {
            prices[count] = price;
            count++;
        }
        else {
            System.out.println("Cannot add item.");
        }
    }

    public double getTotal() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total = total + prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return count;
    }

    public String getCartId() {
        return cartId;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cart ID: ");
        String id = sc.nextLine();

        System.out.print("Enter maximum number of items: ");
        int size = sc.nextInt();

        Cart cart = new Cart(id, size);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter price of item " + (i + 1) + ": ");
            double price = sc.nextDouble();

            cart.addItem(price);
        }

        System.out.println("\nCart ID = " + cart.getCartId());
        System.out.println("Item Count = " + cart.getItemCount());
        System.out.println("Total = " + cart.getTotal());

        sc.close();
    }
}
