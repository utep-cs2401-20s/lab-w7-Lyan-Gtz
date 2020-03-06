public class SortOfSort {
    public void sortOfSort(int[] ar){
        int i = 0;
        int j = ar.length-1;
        int icounter = 0;
        int jcounter = 0;

        while (i < j) {
            int maxIndex = i;
            int temp = 0;
            int max = ar[i];
            for (int k = i; k <= j; k++) {
                if (ar[k] > max) {
                    max = ar[k];
                    maxIndex = k;
                }
            }
            if (icounter == 2 && jcounter == 2) {
                icounter = 0;
                jcounter = 0;
            }
            if (jcounter != 2) {
                temp = ar[j];
                ar[j] = max;
                ar[maxIndex] = temp;
                j--;
                jcounter++;
            }
            else {
                temp = ar[i];
                ar[i] = max;
                ar[maxIndex] = temp;
                i++;
                icounter++;
            }
        }
    }
}
