package yandex.lecture_2_linear_search.lecture;

public class minimumEvenElement {

    public int findMinEven(int[] arr) {
        int rsl = -1;
        for (int i : arr) {
            if ((i % 2 == 0) & (rsl == -1 | i < rsl)) rsl = i;
        }
        return rsl;
    }
}
