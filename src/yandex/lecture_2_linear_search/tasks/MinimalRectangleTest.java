package yandex.lecture_2_linear_search.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimalRectangleTest {

    @Test
    void start() {
        MinimalRectangle minimalRectangle = new MinimalRectangle();
        String[] arr = new String[]{"4", "1 3", "3 1", "3 5", "6 3"};
        String rsl = minimalRectangle.Start(arr);
        System.out.println(rsl);
        Assertions.assertEquals(rsl, "1 1 6 5");

    }
}