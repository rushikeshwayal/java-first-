import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        fruit = fruit.toLowerCase();




        switch (fruit){
            case "mango":
                System.out.println("mangooooo");
                break;
            case "orenge":
                System.out.println("orengeeee");
                break;
            case "apple":
                System.out.println("appeleee");
                break;
            default:
                System.out.println("DUDE");
        }

        String day = input.next();
        day = day.toLowerCase();
        switch (day) {
            case "monday" -> System.out.println("yhsaaaa its Monday");
            case "tuesday" -> System.out.println("yhsaaaa its Tuesday");
            case "wednesday" -> System.out.println("yhsaaaa its Wednesday");
            case "thursday" -> System.out.println("yhsaaaa its Thursday");
            case "friday" -> System.out.println("yhsaaaa its Friday");
            case "saturday" -> System.out.println("yhsaaaa its Saturday");
            case "sunday" -> System.out.println("yhsaaaa its Sunday");
            default -> System.out.println("DUDE");
        }
    }
}
