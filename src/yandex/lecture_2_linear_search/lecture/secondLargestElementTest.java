package yandex.lecture_2_linear_search.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class secondLargestElementTest {

    @Test
    void secondLargest() {
        secondLargestElement secondLargestElement = new secondLargestElement();
        int[] arr = new int[]{3, 6, 9};
        int rsl = secondLargestElement.secondLargest(arr);
        Assertions.assertEquals(rsl, 6);
    }
}