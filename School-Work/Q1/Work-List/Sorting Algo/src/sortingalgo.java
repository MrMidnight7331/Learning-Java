/*
 * @name: Sorting Algorithms with Adjustable Array Printing
 * @author: Tieno
 * @date: 06.06.24
 * @version: 1.7
 */

public class sortingalgo {
	private int[] array;
	private int max = 10;

	public sortingalgo(int size) {
		array = new int[size];
		int index = 0;

		// Generate random nums
		while (index < size) {
			int newNum = (int) (Math.random() * size * 2) + 1;
			boolean duped = false;

			// Check for dupes
			for (int j = 0; j < index; j++) {
				if (array[j] == newNum) {
					duped = true;
					break;
				}
			}

			// If no duplicate is found, assign the new number
			if (!duped) {
				array[index] = newNum;
				index++;
			}
		}

		System.out.print("Init array: ");
		printArray(max); // By default, print first 10 elements
	}

	// Bubble Sort
	public void bubbleSort() {
		long startTime = System.currentTimeMillis(); // Start time

		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		long endTime = System.currentTimeMillis(); // End time
		System.out.print("\nBubble Sort: ");
		printArray(max); // Print first 10 elements after sorting
		System.out.println("Time taken: " + (endTime - startTime) + " ms");
	}

	// Insertion Sort
	public void insertionSort() {
		long startTime = System.currentTimeMillis(); // Start time
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int tmp = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > tmp) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = tmp;
		}

		long endTime = System.currentTimeMillis(); // End time
		System.out.print("\nInsertion Sort: ");
		printArray(max); // Print first 10 elements after sorting
		System.out.println("Time taken: " + (endTime - startTime) + " ms");
	}

	// Selection Sort
	public void selectionSort() {
		long startTime = System.currentTimeMillis(); // Start time

		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIdx]) {
					minIdx = j;
				}
			}
			int temp = array[minIdx];
			array[minIdx] = array[i];
			array[i] = temp;
		}

		long endTime = System.currentTimeMillis(); // End time
		System.out.print("\nSelection Sort: ");
		printArray(max); // Print first 10 elements after sorting
		System.out.println("Time taken: " + (endTime - startTime) + " ms");
	}

	// Utility method to print array with limit
	private void printArray(int limit) {
		System.out.print("[ ");
		for (int i = 0; i < Math.min(limit, array.length); i++) {
			System.out.print(array[i] + " ");
		}
		if (limit < array.length) {
			System.out.print("... ");
		}
		System.out.println("]");
	}

	// Option to print entire array
	public void printFullArray() {
		System.out.println("\nFull array: ");
		printArray(array.length);
	}
}
