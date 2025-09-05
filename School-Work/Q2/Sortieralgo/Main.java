public class Main {

    public static void main(String[] args) {
        Algo al = new Algo();

        // Predefined array (same for all sorts)
        int[] array = {64, 25, 12, 22, 11, 73, 45, 67, 89, 90, 34, 23, 78, 56, 49};

        // Clone the same array for each algorithm
        int[] arr1 = array.clone();
        int[] arr2 = array.clone();
        int[] arr3 = array.clone();

        System.out.println("Original Array:");
        al.printArray(array);

        al.insertionSort(arr1);
        System.out.println("Insertion Sort:");
        al.printArray(arr1);

        al.bubbleSort(arr2);
        System.out.println("Bubble Sort:");
        al.printArray(arr2);

        al.selectionSort(arr3);
        System.out.println("Selection Sort:");
        al.printArray(arr3);
    }
}
