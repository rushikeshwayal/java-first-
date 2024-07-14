import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if (ch>64 & ch<91){
            System.out.println(ch+" Is UpperCase");
        }
        else{
            System.out.println(ch+ " Is LowerCase");
        }
    }
}
