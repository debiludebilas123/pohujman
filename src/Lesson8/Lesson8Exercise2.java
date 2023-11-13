package Lesson8;

public class Lesson8Exercise2 {
    public static void main(String[] args) {
        int[] nums = new int[]{52, 32, 66, 78, 16, 99, 100, 95, 12, 6};
        double sum = 0;
        for (int num : nums) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("The average score is: " + (sum/nums.length));
    }
}
