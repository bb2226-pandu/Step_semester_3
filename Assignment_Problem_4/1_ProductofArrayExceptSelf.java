import java.util.Arrays;
import java.util.Scanner;

class Main {

    static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Forward pass: store product of elements on the left
        int leftProduct = 1;

        for (int i = 0; i < n; i++) {

            answer[i] = leftProduct;

            leftProduct = leftProduct * nums[i];
        }

        // Backward pass: multiply product of elements on the right
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {

            answer[i] = answer[i] * rightProduct;

            rightProduct = rightProduct * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] answer = productExceptSelf(nums);

        System.out.println("Output: " + Arrays.toString(answer));

        sc.close();
    }
}
