public class algo {
    public int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public algo() {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public int binarySearch(int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;

            }
        }
        return -1;
    }
}
