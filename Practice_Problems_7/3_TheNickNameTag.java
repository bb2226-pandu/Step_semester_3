import java.util.Scanner;

class NameTag {

    private final String firstName;
    private final String lastName;

    NameTag(String fullName) {

        String[] parts = fullName.split(" ");

        firstName = parts[0];
        lastName = parts[1];
    }

    public String getNickname() {

        return firstName + " " + lastName.charAt(0) + ".";
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String name = sc.nextLine();

        NameTag tag = new NameTag(name);

        System.out.println("Nickname = " + tag.getNickname());

        sc.close();
    }
}
