
import java.util.Scanner;

public class greatest {
     public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] num = new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter Int "+ i +": ");
            num[i] = obj.nextInt();
        }
        
            if(num[0] > num[1])
            {
                if(num[0] > num[2])
                {
                    System.out.println(num[0] + " is greatest");
                }
                else
                {
                    System.out.println(num[2] + " is greatest");
                }
            }  
           else
           {
            if(num[1]>num[2])
            {
                System.out.println(num[1] + " is greatest");
            }
            else
            {
                System.out.println(num[2] + " is greatest");
            }
           }
           obj.close();
    }
}
