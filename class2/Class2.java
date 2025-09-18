
import java.util.Scanner;

public class Class2 {

    public static void main(String[] args) {
        // ********taking String value as a input ********

        System.out.println("Enter the value of userName");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("The value of userName is " + userName);

        // ********taking Integer value as a input ********
        System.out.println("Enter the value of Age");
        int userAge = sc.nextInt();
        System.out.println("The value of userAge is " + userAge);

        // ********taking Double value as a input ********
        System.out.println("Enter the income of user");
        double income = sc.nextDouble();
        System.out.println("The income of user is " + income);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        int arr[] = {1, 2, 4, 5, 6};

        // for each is the enhance version of for loop basically focus on non primitive data type such as array mostly
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
