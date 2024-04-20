package yandex.lecture_2_linear_search.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class findMaxElementTest {
    @Test
    void findmaxTest() {
        findMaxElement findMaxElement = new findMaxElement();
        int[] arr = new int[]{1, 5, 4, 8, 79, 6, 3};
        int rsl = findMaxElement.findmax(arr);
        Assertions.assertEquals(rsl, 79);
    }
}