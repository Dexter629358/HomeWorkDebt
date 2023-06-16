package geekbrains.homeworks.homework2.task3;

public class App {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 22, 33, 44, 5, -5, -3, 23, -7};
        int[] nums = new int[]{4, 3, -2, -23, 44};
        int[] res = transformArray(nums);

        for (int n : res) {
            System.out.print(n + ", ");
        }
    }

    /**
     * @param nums array of numbers
     * @return changed array of numbers
     * @apiNote Changes the negative numbers to sum of indexes of numbers with 2 digits.
     */
    public static int[] transformArray(int[] nums) {
        int sumIndexes = sumNumbersIndexes(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = sumIndexes;
            }
        }

        return nums;
    }

    /**
     * @param nums array
     * @return sum
     * @apiNote Sums indexes of numbers with 2 digits (negative and positive).
     */
    public static int sumNumbersIndexes(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (num >= 10 && num < 100) {
                res += i;
            }
        }

        return res;
    }
}
