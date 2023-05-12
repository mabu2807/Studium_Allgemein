package sortieren;

public class bubble_sort {

    public int[] bubble_sort(int[] sort){
        int counter = 0;

        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length-1; j++) {
                if(sort[j] > sort[j+1]){
                    int speicher = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = speicher;
                    counter = 0;
                }else {
                    counter++;
                }
               if(counter == sort.length){
                   return sort;
               }
            }
        }

        return sort;
    }
}
