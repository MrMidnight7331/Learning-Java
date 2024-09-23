import java.util.Queue;
import java.util.LinkedList;


public class QueueTest{
    Queue<String> queue = new LinkedList<String>();
    Queue<Integer> nums = new LinkedList<Integer>();

    public QueueTest() {
        queue.offer("Cappuccino");
        queue.offer("Espresso");
        queue.offer("Black Coffee");
        queue.offer("Iced Coffee");

        nums.offer(4);
        nums.offer(3);
        nums.offer(1);
        nums.offer(2);
        nums.offer(5);
        nums.offer(9);
        nums.offer(8);
    }

    public void outputcoffee(){
        System.out.println(queue);
    }

    public void outputnums(){
        Integer[] arr = nums.toArray(new Integer[0]);
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = tmp;
        }
        nums.clear();
        for (int num : arr) {
            nums.offer(num);
        }
        System.out.println(nums);
        
    }
}