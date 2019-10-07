import java.util.Scanner;

public class ClassSecret
{
       public static void main (String[] args)
       {
           Scanner sc = new Scanner(System.in);
           String password = new String("yimeto");
           System.out.println("What's the password?");
           String guess = sc.next();
           if (guess.equals(password)) 
                System.out.println("OK!");
           else
                System.out.println("what te fk");
           
       }
}
