class Algo {  

    // ----- Insertion Sort ----- //
    void insertionSort(int array[]) { 
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
    } 

    // ----- Bubble Sort ----- //
    void bubbleSort(int array[]) { 
        int n = array.length; 
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                if (array[j] > array[j + 1]) { 
                    int tmp = array[j]; 
                    array[j] = array[j + 1]; 
                    array[j + 1] = tmp; 
                } 
            } 
        } 
    } 

    // ----- Selection Sort ----- //
    void selectionSort(int array[]) { 
        int n = array.length; 
        for (int i = 0; i < n - 1; i++) { 
            int min_idx = i; 
            for (int j = i + 1; j < n; j++) { 
                if (array[j] < array[min_idx]) 
                    min_idx = j; 
            } 

            int tmp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = tmp; 
        } 
    } 

    // ----- Print Array ----- //
    static void printArray(int array[]) { 
        for (int i = 0; i < array.length; i++) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    } 
}