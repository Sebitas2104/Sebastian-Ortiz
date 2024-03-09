package primerparcial;

import java.util.Scanner;

public class currency{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dollar = 3928;
        int money = 0;

        System.out.println("Type the value (No . and ,)");
        money = scanner.nextInt();

        money = money * dollar;
        System.out.println("The conversion is $" +money);
    }
}
//import java.util.Scanner;
//
//public class currency{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double Euro = 0.92;
//        double money = 0;
//
//        System.out.println("enter the dollars to be exchanged to euro (No . and ,)");
//        money = scanner.nextInt();
//
//        money = money * Euro;
//        System.out.println("The conversion is $" +money);
//    }
//}
