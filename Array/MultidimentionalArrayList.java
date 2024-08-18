import java.util.ArrayList;
import java.util.Scanner;

public class MultidimentionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

//        initialisation
        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println("please enter 9 values");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);
    }
}
