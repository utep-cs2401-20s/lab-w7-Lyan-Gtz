class SortOfSort {
    void sortOfSort(int[] ar){
        int max = ar[0];
        int icounter = 0;
        int jcounter = 0;
        int maxIndex = 0;
        int temp = 0;
        int i = 0;
        int j = ar.length-1;

        while (i < j) {
            for (int k = i; k <= j; k++) {
                if (max < ar[k]) {
                    max = ar[k];
                    maxIndex = k;
                }

                if (jcounter != 2) {
                    temp = ar[j];
                    ar[j] = max;
                    ar[maxIndex] = temp;
                    jcounter += 1;
                    j--;
                } else if (icounter != 2) {
                    temp = ar[i];
                    ar[i] = max;
                    ar[maxIndex] = temp;
                    icounter += 1;
                    i++;
                } else if (icounter == 2 && jcounter == 2) {
                    icounter = 0;
                    jcounter = 0;
                }
            }
        }
    }
}
