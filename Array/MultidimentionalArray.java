import java.util.Arrays;
import java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String[] args) {

         int[][] arr = new int[3][3];
         int[][] arr2 = {{1,2,3},{4,5,3},{2,4,1}};
        Scanner input = new Scanner(System.in);

// Input 2D array

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                arr[i][j]=input.nextInt();

            }
        }

//printing array

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

//Using to string

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
         }
}
