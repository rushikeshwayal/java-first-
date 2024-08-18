import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(28);
        list.add(45);
        list.add(59);
        list.add(45324);
        list.add(445);
        list.add(4145);
        list.add(445);
        list.add(4565);
        System.out.println(list);
        list.set(0,12);
        System.out.println(list);

    }
}
