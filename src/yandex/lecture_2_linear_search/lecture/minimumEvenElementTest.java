package yandex.lecture_2_linear_search.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class minimumEvenElementTest {

    @Test
    void findMinEven() {
        minimumEvenElement minimumEvenElement = new minimumEvenElement();
        int[] arr = new int[]{8,5,2,3,8,9};
        int rsl = minimumEvenElement.findMinEven(arr);
        Assertions.assertEquals(rsl, 2);
    }
}