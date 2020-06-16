import java.util.Scanner;

public class Number4 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        float a = sc.nextInt();
        System.out.print("b = ");
        float b = sc.nextInt();
        System.out.println("phuong trinh ban vua nhap la: " +a +"x"+"+"+b+"="+0);
        giaiPTBac1(a,b);
    }
    public static void giaiPTBac1(float a,float b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem.");
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        } else {
            System.out.println("phuong trinh co 1 nghiem x = " + -(b / a * 1.0f));
        }
    }
}
