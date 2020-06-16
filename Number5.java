import java.util.Scanner;

public class Number5 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        float a = sc.nextInt();
        System.out.print("b = ");
        float b = sc.nextInt();
        System.out.print("c = ");
        float c = sc.nextInt();
        System.out.println("phuong trinh ban vua nhap la: " +a +"X2"+"+"+b+"X"+"+"+c+"="+0);
        giaiPTBac2(a,b,c);
    }
    public static void giaiPTBac2(float a,float b,float c)
    {
        if(a==0)
        {
            if(b==0)
            {
                System.out.println("phuong trinh co vo so nghiem.");
            }
            else
            {
                System.out.println("phuong trinh co 1 nghiem.");
            }
        }

        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }

}
