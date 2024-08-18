import java.util.Arrays;

import static java.util.Collections.swap;

public class array {
    public static void main(String[] args) {
        System.out.println("hello");
        int []roll = new int[5];
        int []roll2 = {4,33,55,22};


        System.out.println(Arrays.toString(roll2));
        reverse(roll2);
        for (int i = 0; i < roll2.length; i++) {
            System.out.print(roll2[i]+" ");
        }

//        reverse(roll2);
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr,int start, int end){
            int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
    }

}
