import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        System.out.println("hello");
        int []roll = new int[5];
        int []roll2 = {4,33,55,22};


        System.out.println(Arrays.toString(roll2));
        for (int i = 0; i < roll2.length; i++) {
            System.out.print(roll2[i]+" ");
        }
    }

}
