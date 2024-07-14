import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Q print number from 1 to 10
        int num = input.nextInt();
        for (int i = 1; i <=num ; i++) {
            System.out.print(i);
        }
        System.out.println();
//        while loop
        int i =1;
        while( i<=num){
            System.out.print(i);
            i++;
        }

//        do while loop
        System.out.println();


        int n=1;
do {
    System.out.print(n);
    n++;
}while (n<=num);

    }
}
