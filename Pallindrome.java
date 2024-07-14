public class Pallindrome {
    public static void main(String[] args) {
        int num=12345;
        int rev= 0;
        while (num>0){
            rev = num%10 + rev*10;
            num = num/10;
        }
        System.out.println(rev);
    }
}
