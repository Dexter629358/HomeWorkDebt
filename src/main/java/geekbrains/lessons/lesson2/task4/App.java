package geekbrains.lessons.lesson2.task4;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 5, 8, 6, 3};
        int res = countPairs(arr);

        System.out.println("res = " + res);
    }

    /**
     * @param nums number of numbers
     * @return number of paired numbers
     * @apiNote counts pairs numbers, where first number is bigger, then second number.
     */
    public static int countPairs(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i] * 2) {
                count++;
            }
        }

        return count;
    }
}
