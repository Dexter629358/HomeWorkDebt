package geekbrains.lessons.lesson2.task2;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] res = runningSum(arr);

        for (int n : res) {
            System.out.print(n + ", ");
        }
    }

    /**
     * @param nums array of nums
     * @return sum of each previous numbers
     * @apiNote Define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     */
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
