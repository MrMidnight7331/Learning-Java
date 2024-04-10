/**
 * @project Array-Example
 * @author  Tieno
 * @version 1.0
 */

public class Array { // Define class
    int[] nums; // Creats an array called nums

    public Array() { // Constructur
        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Gives number 1 - 10 into array
        for (int i = 0; i < nums.length; i++) { // the integer i is = 0, while i is smaller than the length of num, i + 1
            System.out.println(nums[i]); //print everything inside num
        }
    }
}
