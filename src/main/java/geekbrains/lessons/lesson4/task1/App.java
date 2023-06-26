package geekbrains.lessons.lesson4.task1;

public class App {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode cur = head;

        while (cur != null) {
            System.out.print(cur.val + ", ");
            cur = cur.next;
        }

        System.out.println();

        head = reverseList(head);
        cur = head;

        while (cur != null) {
            System.out.print(cur.val + ", ");
            cur = cur.next;
        }
    }

    /**
     * @param head initial point of the list
     * @return reversed list
     * @apiNote Reverses the list.
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }
}
