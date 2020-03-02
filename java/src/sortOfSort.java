public class sortOfSort {
    void sortOfSort(int[] array){
        int maxValue = array[0];
        int[] nArray1 = new int[array.length];
        int[] nArray2 = new int[array.length-1];
        for(int i = 0; int k=0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
                nArray1[nArray1.length-1] = maxValue;
            }
            nArray2[k++] = array[i];
        }
        return nArray1;
    }
}
