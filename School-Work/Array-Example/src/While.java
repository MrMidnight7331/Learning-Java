/**
 * @project While-Loop-Example
 * @author Tieno
 * @version 1.0
 */

public class While {
    int[] nums;

    public While() {
        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public void forwhile(){
        int i = 0;
        while (i < nums.length) { // Use while loop to iterate through the array
            System.out.println(nums[i]);
            i++;
        }
    }

    public void forwhileMaxMinNumberIndex(){
        int max = nums[0];
        int min = nums[0];
        int maxIndex = nums[0];
        int minIndex = nums[0];

        int i = 1;
        while (i < nums.length) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }

            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            i++;
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        System.out.println("Index of maximum number: " + maxIndex);
        System.out.println("Index of minimum number: " + minIndex);
    }
}