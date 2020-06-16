import java.util.Scanner;

public class Number11 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        int GT = 1;
        for (int i=1;i<=a;i++)
        {
            GT = GT *i;
        }
        System.out.print("KQ:"+a+"!"+"="+GT);
    }

}
