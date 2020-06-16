import java.util.Scanner;

public class Number9 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("uoc chung lon nhat a vs b la: " + searchUCLN(a,b));
    }
    public static int searchUCLN(int a,int b)
    {
        if(b==0) {
            return a;
        }
        return searchUCLN(b, a%b);
    }

}
