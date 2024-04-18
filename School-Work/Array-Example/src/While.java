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
}
