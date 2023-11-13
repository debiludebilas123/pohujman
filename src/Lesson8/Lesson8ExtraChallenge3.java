package Lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson8ExtraChallenge3 {
    public static void main(String[] args) {
        {
            /* Terrible, but it works and I don't want to fix it*/

            Scanner scanner = new Scanner(System.in);
            // Set up the directions array
            String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                    "Walk down the road for two blocks until you reach the traffic lights.",
                    "At the traffic lights, turn right onto Oak Street.",
                    "Follow Oak Street for one block then turn left onto Elm Street.",
                    "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                    "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                    "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
            };

            // Print out each direction
            printArr(directions);
            if (directions[3].equals("Follow Oak Street for one block then turn left onto Elm Street.")) {
                directions = addToArray(directions);
                printArr(directions);
            }
            printArr(removeLastElement(directions));

            System.out.print("Enter a new instruction: ");
            String instruction = scanner.next();
            System.out.print("Enter which position it should be inserted into: ");
            int pos = scanner.nextInt();
            printArr(addToSpecificPos(directions, pos, instruction));

        }
    }

    public static String[] addToSpecificPos(String[] arr, int pos, String instruction) {
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(arr));
        arr2.add(pos - 1, instruction);
        arr = arr2.toArray(new String[0]);
        return arr;
    }

    public static String[] addToArray(String[] arr) {
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(arr));
        arr2.add(4, addStep());
        arr = arr2.toArray(new String[0]);
        return arr;
    }

    public static String addStep() {
        return "After turning onto Elm Street, walk past the grocery store on your right.";
    }

    public static void printArr(String[] arr) {
        int step = 1;
        for (String direction : arr) {
            System.out.format("%d. %s %n", step, direction);
            step++;
        }
        System.out.println();
    }

    public static String[] removeLastElement(String[] arr) {
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(arr));
        arr2.remove(arr2.size() - 1);
        arr = arr2.toArray(new String[0]);
        return arr;
    }
}
