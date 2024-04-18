package yandex.lecture_2_linear_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrassTest {

    @Test
    void grassStart() {
        Grass grass = new Grass();
        int x1 = 2;
        int y1 = 1;
        int x2 = 12;
        int y2 = 8;
        int x3 = 13;
        int y3 = -1;
        int r = 5;
        int rsl = grass.grassStart(x1, y1, x2, y2, x3, y3, r);
        Assertions.assertEquals(rsl, 8);
    }
}