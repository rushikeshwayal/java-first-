import java.util.Scanner;

public class $_7_caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1 = input.next().trim().charAt(0);
        int c = ch1;
        System.out.println("ch1 = "+ c);
        char ch2 = input.next().trim().charAt(0);
        int d = ch2;
        System.out.println("ch2 = "+d);

        if (ch1>ch2){
            System.out.println(ch1+" is greater than"+ch2);
        }
        else {
            System.out.println(ch2+" is greater than"+ch1);
        }
    }
}
