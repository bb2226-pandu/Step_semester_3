import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int sum = 0 ;
        while(number>0){
            int digit = number%10;
            sum = sum + digit*digit*digit;
            number = number/10;
        }
        if(sum == original){
            System.out.println("armstrong number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
