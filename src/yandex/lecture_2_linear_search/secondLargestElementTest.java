package yandex.lecture_2_linear_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class secondLargestElementTest {

    @Test
    void secondLargest() {
        secondLargestElement secondLargestElement = new secondLargestElement();
        int[] arr = new int[]{3, 6, 9};
        int rsl = secondLargestElement.secondLargest(arr);
        Assertions.assertEquals(rsl, 6);
    }
}