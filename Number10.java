import java.util.Scanner;

public class Number10 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("a = ");
        int b = sc.nextInt();
        System.out.println("nhap phep tinh ban muon:");
        char PhepTinh = sc.next().charAt(0);
        sum(a,b,PhepTinh);
    }
    public static void sum(int a,int b,char PhepTinh)
    {

        switch (PhepTinh)
        {
            case '+':
                System.out.print(a + " + " +b+" = "+(a+b));
                break;
            case '-':
                System.out.print(a + " - " +b+" = "+(a-b));
                break;
            case '*':
                System.out.print(a + " * " +b+" = "+(a*b));
                break;
            case '/':
                if(b==0)
                {
                    System.out.println("phep tinh khong hop le mau so phai khac 0.");
                }
                else
                {
                    System.out.print(a + " / " +b+" = "+(float)(a/b*1.0f));
                }
                break;
            default:
                System.out.print("phep tinh ban nhap khong hop le.");
        }


    }

}
