public class Array {
	int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	public void output() {
		System.out.println("The array contains: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public int max() {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return (max);
	}

	public int min() {
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}

	public void sum() {
		int tmp = 0;
		for (int i = 0; i < nums.length; i++) {
			tmp += nums[i];
		}
		System.out.println("The sum of all int is:" + tmp);
	}

	public void average() {
		int tmp = 0;
		for (int i = 0; i < nums.length; i++) {
			tmp += nums[i];
		}
		System.out.println("Average is: " + tmp / nums.length);
	}

	public void switchelements(int x, int y) {
		if (x < 0 || x >= nums.length || y < 0 || y >= nums.length) {
			System.out.println("Invalid index");
			return;
		}
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}

	public void search(int x) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == x) {
				count++;
			}
		}
		System.out.println("The number " + x + " is found " + count + " times in the array.");
	}

	public boolean clone(int x) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == x) {
				count++;
			}
		}
		return count == 2;
	}

	public void smallest_two() {
		if (nums.length < 2) {
			System.out.println("Array needs least two elements");
			return;
		}

		int smallest = nums[0];
		int secondSmallest = nums[1];

		if (smallest > secondSmallest) {
			int temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}

		for (int i = 2; i < nums.length; i++) {
			if (nums[i] < smallest) {
				secondSmallest = smallest;
				smallest = nums[i];
			} else if (nums[i] < secondSmallest) {
				secondSmallest = nums[i];
			}
		}

		System.out.println("Smallest: " + smallest);
		System.out.println("Second Smallest: " + secondSmallest);
	}
}