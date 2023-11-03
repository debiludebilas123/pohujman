import java.util.Scanner;

public class Lesson8ExtraChallenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            names[i] = scanner.next();
        }
        System.out.println(names[0]);
        System.out.println(names[4]);
        System.out.println("The number of items in the array is: "+names.length);
    }
}
