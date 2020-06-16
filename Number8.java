import java.util.Scanner;

public class Number8 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.println("boi chung bo nhat cua a va b la: "+searchBCNN(a,b));

    }
    public static int UCLN(int a,int b)
    {
        if(b==0) {
            return a;
        }
        return UCLN(b, a%b);
    }
    public static int searchBCNN(int a,int b)
    {
        return (a*b)/UCLN(a,b);
    }
}
