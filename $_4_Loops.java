import java.util.Scanner;

public class $_4_Loops {
    public static void main(String[] args) {

        // while loop
        int i=0;
        while (i<=5)
        {
            System.out.print(" "+i);
            i++;
        }
        System.out.println(" ");

        //for loop
        for (int j = 0; j < 6 ; j++) {
            System.out.print(" "+j);
        }



        // fahrenheit to celsius
        Scanner input = new Scanner(System.in);
        System.out.println("  ");
        float celsius = input.nextFloat();
        float fahrenheit = celsius * ((float) 9 /5) + 32;
        System.out.println(fahrenheit);
    }
}
