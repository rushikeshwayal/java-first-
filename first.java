import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("hello World");
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println(num);
//        int num2 =4;
//        char c = 'f';
//        boolean check =true;
//        float marks = 34.2f;
//        double largedecimal = 53804.24444;
//        long largInteger = 442807847674246L;

//int num = 20_000_000;
//        System.out.println(num);
        float num1 = input.nextFloat();

        float num2 = input.nextFloat();
        float sum = num1 + num2;
        sum = (int)(sum);
        System.out.println(sum);
        int ask = 'A';
        System.out.println(ask);

    }
}
