import java.util.Scanner;

public class $_11_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float ans=0;
while(true) {


    char op = input.next().trim().charAt(0);


    if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ) {

        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        if (op == '+') {
            ans = num1 + num2;
        }
        if (op == '-') {
            ans = num1 - num2;
        }
        if (op == '/') {
            ans = num1 / num2;
        }
        if (op == '*') {
            ans = num1 * num2;
        }
        if (op == '%') {
            ans = num1 % num2;
        }
        System.out.println(ans);
    } else {
        System.out.println("Wrong Input");
    }
}

    }
}
