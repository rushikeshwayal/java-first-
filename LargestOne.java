import java.util.Scanner;

public class LargestOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1>num2 & num1>num3){
            System.out.println(num1+ " > " + num2 +" & "+num3);
        } else if (num2>num1 & num2>num3){
            System.out.println(num2+ " > " + num1 +" & "+num3);
        }
        else {
            System.out.println(num3+ " > " + num1 +" &  "+num2);

        }

        int max1=Math.max(num1,num2);
        int max = Math.max(max1,num3);
        System.out.println(max);

    }
}
