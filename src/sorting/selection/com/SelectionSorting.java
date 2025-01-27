package sorting.selection.com;

public class SelectionSorting {

    // Method to sort an array
    public static void selectionSort(int [] arr) {
        int length = arr.length;
        //Looking for index of minimum element of array
        for (int index = 0; index < length ; index++) {
            int minIndex = index;
            for (int index1 = index + 1; index1 < length; index1++) {
                if (arr [index1] < arr[index]) {
                    minIndex = index1;
                }
            }
            // Swapping the minimum element with the first element of the unsorted portion
            int temporal = arr[minIndex];
            arr[minIndex] = arr[index];
            arr[index] = temporal;
        }
    }

    public static void main (String [] str) {
        // Creating an array for sorting
        int [] array = {64, 25, 22, 11, -7};

        // Printing an array before sorting to console
        System.out.println("Array before sorting:");
        for (int  element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        // Sorting the array
        SelectionSorting.selectionSort(array);

        // Printing an array after sorting to console
        System.out.println("Array after sorting:");
        for (int  element : array) {
            System.out.print(element + " ");
        }
    }
}


