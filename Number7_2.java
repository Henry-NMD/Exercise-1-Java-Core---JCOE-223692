import java.util.Scanner;

public class Number7_2 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("nhap gia tri phan tu mang:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("arr[%d] = ",i);
            arr[i] = sc.nextInt();
        }
        System.out.println("mang ban vua nhap la:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
                if((arr[i] ==2)||(arr[i]%2!=0)&&(arr[i]>1))
                {
                        System.out.println("so nguyen to trong mang la: "+arr[i] + " ");
                }

                else
                {
                   System.out.println("khong co so nguyen to nao trong mang.");
                   break;
                }



        }
    }

}
