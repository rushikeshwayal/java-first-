import java.util.Scanner;

public class $_8_fibo {
    public static void main(String[] args) {
        //        int a=0,b=1;


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while (count<=n)
        {
            int temp =b ;
            b = b+a;
            a = temp;
            count++;
        }
        if (n==1){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }


    }
}
