/*
 * @name: Binary searching algo
 * @author: Tieno
 * @date: 06.06.24
 * @version: 1.2
 */


public class algo {
    public int[] array;

    public algo(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }

        System.out.print("Init array length: " + array.length);
    }

    public int binarySearch(int target) {
        int left = 0;
        int right = array.length - 1;
        int counter = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            counter++;
            if (array[mid] == target) {
                System.out.println("\nTarget found at index " + mid + " after " + counter + " searches.");
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("\nTarget not found after " + counter + " searches.");
        return -1;
    }
}