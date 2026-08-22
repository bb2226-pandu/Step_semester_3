import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("yes,it is a Prime Number");
        }else{
            System.out.println("no");
        }
    }
}