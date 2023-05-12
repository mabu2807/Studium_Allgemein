package sortieren;

public class quick_sort {
    private static int quickSortSwapCount = 0;
    public static int[] quickSort(int[] numbers){
        quickSortSwapCount = 0;
        quickSort(numbers, 0, numbers.length-1);
        return numbers;
    }

    private static void quickSort(int[] numbers, int left, int right){

        int indexLeft = left;
        int indexRight = right;

        if(left < right){
            int pivot = numbers[(indexLeft + indexRight) / 2];

            while(indexLeft <= indexRight){
                while(numbers[indexLeft] < pivot){
                    indexLeft++;
                }
                while(numbers[indexRight] > pivot){
                    indexRight--;
                }
                if(indexLeft <= indexRight){
                    swap(numbers, indexLeft, indexRight);
                    quickSortSwapCount++;
                    indexLeft++;
                    indexRight--;
                }
            }

            if(left < indexRight){
                quickSort(numbers, left, indexRight);
            }
            if(indexLeft < right){
                quickSort(numbers, indexLeft, right);
            }

        }

    }
    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
