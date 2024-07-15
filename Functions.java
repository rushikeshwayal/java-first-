import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        int ans=sum(12,34);
        System.out.println(ans);
        System.out.println(greet());
        num(1,5,6,6,8);


    }
    static int sum(int num1,int num2)
    {
        int res = num1 + num2;
        System.out.print("result is :");
        return res;
    }

    static String greet(){
        String name = "Rushikesh Wayal";
        System.out.print("my name is:");
        return name;
    }

    static void num(int...n){
        System.out.println(Arrays.toString(n));
    }

}
