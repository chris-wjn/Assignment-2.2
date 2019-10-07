import java.util.Scanner;
public class GradeBot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What was your test out of?");
        double test = sc.nextDouble();
        if (test <= 0) {
            System.out.println("Ok funny guy");
            while (test <= 0) {
            test = sc.nextDouble();
            if (test <= 0 ) System.out.println("Ok funny guy");
        }
        }
        
        System.out.println("And what was your score?");
        double grade = sc.nextDouble();
        if (grade < 0) {
            System.out.println("Ok funny guy");
            while (grade < 0) {
            grade = sc.nextDouble();
            if (grade < 0) System.out.println("Ok funny guy");
        }
        }
        
        double percent = ((grade/test)*100);
        System.out.println(percent + "%");
        
        if (percent > 100) System.out.println("cheats");
        else if (percent == 100) System.out.println("ok einstein calm it down buddy");
        else if (percent >= 86) System.out.println("solid");
        else if (percent >= 73) System.out.println("respectable");
        else if (percent >= 67) System.out.println("W.O.A.T level");
        else if (percent >= 60) System.out.println("grow a brain before attempting next test");
        else if (percent >= 50) System.out.println("its doomed");
        else if (percent >= 0) System.out.println("go next");
        
    }
}
