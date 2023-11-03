public class Lesson8ExtraChallenge2 {
    public static void main(String[] args) {
        int[] nums = new int[]{52, 32, 66, 78, 16, 99, 100, 95, 12, 6};
        int max = 0;
        int min = 9999;
        double sum = 0;
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            System.out.println(num);
            sum += num;
        }
        System.out.println("The average score is: " + (sum / nums.length) + "\nThe maximum score is: " + max + "\nThe minimum score is: " + min);
    }
}
