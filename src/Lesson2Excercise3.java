import java.util.*;

public class Lesson2Excercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of item 1: ");
        String item1 = input.next();
        System.out.print("Enter the price of item 1: ");
        double price1 = input.nextDouble();
        System.out.print("Enter the name of item 2: ");
        String item2 = input.next();
        System.out.print("Enter the price of item 2: ");
        double price2 = input.nextDouble();
        System.out.print("Enter the name of item 3: ");
        String item3 = input.next();
        System.out.print("Enter the price of item 3: ");
        double price3 = input.nextDouble();
        double total = price1 + price2 + price3;
        System.out.print("NESMART\n" + item1 + "............£" + price1 + "\n" + item2 + ".............£" + price2 + "\n" + item3 + ".............£" + price3 + "\nSUBTOTAL........£" + total);
    }
}
