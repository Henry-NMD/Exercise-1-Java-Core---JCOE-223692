import java.util.Scanner;

public class Number6 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number = ");
        int Number = sc.nextInt();
        if(Number > 1)
        {
            if((Number%2!=0)||(Number==2))
            {
                System.out.println("day la so nguyen to.");
            }
            else
            {
                System.out.println("day khong phai la so nguyen to.");
            }

        }
    }
}
