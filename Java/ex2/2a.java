package ex2;
import java.util.*;

/**
 * 2a
 */
class student {
    int rl_no;
    String name;
    student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no: ");
        rl_no =sc.nextInt();
        System.out.println("Enter name :");
        name =sc.nextLine();
        sc.close();
    }
    void putdata()
    {
        System.out.println("Name of student is: "+ name);
        System.out.println("Roll no of student is: "+ rl_no);

    }
    public static void main(String[] args) {
        student s1= new student();
        student s2= new student();
        s1.putdata();
        s2.putdata();
        
    }
}