import java.util.Scanner;

public class Number7_1 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("nhap so phan tu mang: ");
        for(int i=0;i<N;i++)
        {
            System.out.printf("arr[%d] = ",i);
            arr[i] = sc.nextInt();
        }
        System.out.println("mang ban vua nhap la:");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("mang sau khi sap xep la:");
        sapxep(arr);
        showMe(arr);
    }
    public static void sapxep(int[] arr)
    {
        int temp = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void showMe(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
