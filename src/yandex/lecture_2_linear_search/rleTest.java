package yandex.lecture_2_linear_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rleTest {

    @Test
    void rleStart() {
        rle rle_ = new rle();
        String str = "AAABBBBDFFFFFFFSSSSSSHHHH";
        String rsl = rle_.rleStart(str);
        Assertions.assertEquals(rsl, "A3B4DF7S6H4");
    }
}