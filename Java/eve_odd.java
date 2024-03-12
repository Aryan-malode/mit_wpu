
import java.util.Scanner;
public class eve_odd {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an Int: ");
        int num = obj.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("The Number "+ num + " is even ");
        }
        else
        {
            System.out.println("The Number "+ num + " is odd ");
        }
        obj.close();
    }
    
}
