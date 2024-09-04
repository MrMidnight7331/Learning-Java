/**
 * @project Array-Example
 * @author Tieno
 * @version 1.0
 */

public class Array { // Define class
    int[] nums; // Creats an array called nums

    public Array() { // Constructur
        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Gives number 1 - 10 into array
        for (int i = 0; i < nums.length; i++) { // the integer i is = 0, while i is smaller than the length of num, i + 1
            //System.out.println(nums[i]); //print everything inside num
        }
    }

    public void countTo(int x){
        /* 
            x = 1 - 10
            if x > 10 or x < 1 = error
            print x 
        */

        if (x >= 1 && x <= 10) { // check if x is between 1 and 10 (inclusive)
            for (int i = 0; i < x; i++){
                System.out.println(nums[i]);
            }
        } else {
            System.out.println("Error: x should be between 1 and 10."); // print error message
        }
    }
    public void max(){
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
            max = nums[i]; 
            }
        }
        System.out.println("Largest num is: " + max);
    }

    public void maxidx(){
        int maxidx = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[maxidx]){
                maxidx = i;
            }
        }
        System.out.println("Largest num index is: " + maxidx);
    }

    public void min(){
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > min){
                min = nums[i]; 
            }
        }
        System.out.println("Largest num is: " + min);
    }

    public void minidx(){
        int minidx = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[minidx]){
                minidx = i;
            }
        }
        System.out.println("Smallest num index is: " + minidx);
    }
}
