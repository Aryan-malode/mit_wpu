package ex2;
import java.util.*;
 class stdnt {
    String name;
    float perc;
    stdnt()
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name :");
        name =sc.nextLine(); 
        System.out.println("Enter percentage: ");
        perc =sc.nextFloat();
        sc.close();
    }
    void display()
    {
        System.out.println("Percentage is "+perc+"%");
        System.out.println("Name is " + name);
    }

    public static void main(String[] args)
    {
        stdnt s1 = new stdnt() ; 
        s1.display();
    }
}
