import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTestN {

    @Test
    void sortOfSort1() {
        SortOfSort sos = new SortOfSort();
        int[] ar = {4,2};
        int[] b = new int[] {2,4};
        sos.sortOfSort(ar);
        assertArrayEquals(b,ar);
    /*Test was conducted to see how it will behave when a string of two elements was given. If array was swap it was
        correct, if not, then the test will fail. Test passed*/
    }

    @Test
    void sortOfSort2() {
        SortOfSort sos = new SortOfSort();
        int[] ar = {4};
        int[] b = new int[] {4};
        sos.sortOfSort(ar);
        assertArrayEquals(b,ar);
    /*Test was conducted to know if a single value could be given in the array or if an error was produced since only
     one value was provided instead of 2. Test passed*/
    }

    @Test
    void sortOfSort3() {
        SortOfSort sos = new SortOfSort();
        int[] ar = {};
        int[] b = new int[] {};
        sos.sortOfSort(ar);
        assertArrayEquals(b,ar);
    /*Test was conducted to know if an empty array could be taken and return empty or error. Test passed providing
    an empty array as result*/

    }

    @Test
    void sortOfSort4() {
        SortOfSort sos = new SortOfSort();
        int[] ar = {9,6,4,1,5};
        int[] b = new int[] {5,4,1,6,9};
        sos.sortOfSort(ar);
        assertArrayEquals(b,ar);
    /*Test was conducted to know if an array with n number of elements could be sorted as needed or if it could take
    only certain amount of elements. Test passed and array was sorted correctly*/
    }

    @Test
    void sortOfSort5() {
        SortOfSort sos = new SortOfSort();
        int[] ar = {9,6,4,1,5,-1,20,-10,7};
        int[] b = new int[] {7,6,1,-1,-10,4,5,9,20};
        sos.sortOfSort(ar);
        assertArrayEquals(b,ar);
    /*Test was conducted to know if an array with negative and positive values could be taken and sorted as it should be.
    Test passed and array was sorted as expected*/
    }
}