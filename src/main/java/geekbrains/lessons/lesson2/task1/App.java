package geekbrains.lessons.lesson2.task1;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        boolean isPalindrome = palindrome(arr);
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    /**
     * @param arr incoming string
     * @return true if arr is a palindrome, otherwise false
     * @apiNote Validates if array is a palindrome.
     */
    public static boolean palindrome(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
