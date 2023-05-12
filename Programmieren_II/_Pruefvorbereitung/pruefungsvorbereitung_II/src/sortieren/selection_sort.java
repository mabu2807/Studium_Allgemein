package sortieren;

public class selection_sort {
//    public static int[] selctionsort(int[] sort) {
//        for (int i = 0; i < sort.length - 1; i++) {
//            for (int j = 0; j < sort.length; j++) {
//                if(sort[j]< sort[i]){
//                    int speicher = sort[i];
//                    sort[i] = sort[j];
//                    sort[j] = speicher;
//                }
//
//            }
//        }
//        return sort;
//    }
    public static int[] selectionSort(int[] numbers){

        int sortedMarker = numbers.length - 1;
        while(sortedMarker > 0){
            int maxPos = sortedMarker;
            for(int i = 0; i < sortedMarker; i++){
                if(numbers[i] > numbers[maxPos]){
                    maxPos = i;
                }
            }
            int temp = numbers[maxPos];
            numbers[maxPos] = numbers[sortedMarker];
            numbers[sortedMarker] = temp;

            sortedMarker--;
        }

        return numbers;
    }


}

