public class CountNums {
    public static void main(String[] args) {
        int num  = 453536;
        int count = 0;
        while (num>0){
            int rem = num%10;
            num = num/10;
            if (rem==3){
                count++;
            }
        }
        System.out.println(count);
    }
}
