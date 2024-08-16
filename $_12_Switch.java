import java.util.Scanner;

public class $_12_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name Of fruit : ");
        String fruit = input.next();

//        switch (fruit){
//            case "Mango" :
//                System.out.println("king of fruits :"+fruit);
//                break;
//            case "Apple":
//                System.out.println("A fruit a day stay doctor away :"+fruit);
//                break;
//            case "Grapes":
//                System.out.println("fruit that can be achived only by hard work :"+fruit);
//                break;
//            case "Orange":
//                System.out.println("Looks like orange also name is : "+fruit);
//                break;
//            default:
//                System.out.println("😒 really is this a fruit 🤥");
//        }


        switch (fruit) {
            case "Mango" -> System.out.println("👑king of fruits 🥭:" + fruit);
            case "Apple" -> System.out.println("🧑‍⚕️A fruit a day stay doctor away🍎 :" + fruit);
            case "Grapes" -> System.out.println("👷‍♂️fruit that can be achived only by hard work🍇 :" + fruit);
            case "Orange" -> System.out.println("🟠Looks like orange also name is🍊 : " + fruit);
            default -> System.out.println("😒 really is this a fruit 🤥");
        }

        System.out.print("Enter the nth number of day : ");
        int day = input.nextInt();


//        switch (day){
//            case 1 :
//                System.out.println("monday🍉");
//                break;
//            case 2 :
//                System.out.println("tuesday😘");
//                break;
//            case 3 :
//                System.out.println("wednesday👌");
//                break;
//            case 4 :
//                System.out.println("thursday🤦‍♂️");
//                break;
//            case 5 :
//                System.out.println("friday😎");
//                break;
//            case 6 :
//                System.out.println("saturday😁");
//                break;
//            case 7 :
//                System.out.println("sunday😍");
//                break;
//            default:
//                System.out.println("do you really think number of days`s in week can be greater than 7 🤡");
//        }


        switch (day) {
            case 1 -> System.out.println("monday🍉");
            case 2 -> System.out.println("tuesday😘");
            case 3 -> System.out.println("wednesday👌");
            case 4 -> System.out.println("thursday🤦‍♂️");
            case 5 -> System.out.println("friday😎");
            case 6 -> System.out.println("saturday😁");
            case 7 -> System.out.println("sunday😍");
            default -> System.out.println("do you really think number of days`s in week can be greater than 7 🤡");
        }


//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//            default:
//                System.out.println("really bro... , I mean seriously 😒😣");
//        }
//
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default -> System.out.println("really bro... , I mean seriously 😒😣");
        }


    }
}
