public class FunctionOverLoading {
    public static void main(String[] args) {
        sum(12,45,90);

    }
    static void sum(int a , int b, int c){
       int res = a+b+c;
        System.out.println(res);
    }
    static  void sum(int a,int b){
        int res = a+b;
        System.out.println(res);
    }

}
