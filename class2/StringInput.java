
import java.util.Scanner;
public class StringInput{
    public static void main( String []args){
        System.out.println("Enter the value of userName");
        Scanner sc=new Scanner(System.in);
        String userName=sc.nextLine();
        System.out.println("The value of userName is "+userName);

    }
}