package yandex.lecture_2_linear_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pitcraftTest {

    @Test
    void isleflood() {
        pitcraft pitcraft_ = new pitcraft();
        int[] arr = new int[]{4,3,4,5,4,3,4};
        int rsl = pitcraft_.isleflood(arr);
        Assertions.assertEquals(rsl, 2);
    }
}