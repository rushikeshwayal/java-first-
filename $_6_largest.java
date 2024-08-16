import java.util.Scanner;

public class $_6_largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = input.nextInt();
        System.out.print("Enter the value of b : ");
        int b = input.nextInt();
        System.out.print("Enter the value of c : ");
        int c = input.nextInt();

        if (a>b && a>c){
            System.out.println(a+" is greater than "+ b +" & "+ c);
        }
        else if (b>a && b>c) {
            System.out.println(b+" is greater than "+ c +" & "+ a);
        }
        else {
            System.out.println(c+" is greater than "+ b +" & "+ a);
        }

       int e = Math.max(c,Math.max(a,b));

        System.out.println(e);
    }
}
