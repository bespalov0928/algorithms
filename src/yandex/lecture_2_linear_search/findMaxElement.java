package yandex.lecture_2_linear_search;

public class findMaxElement {
    public int findmax(int[] seq) {
        int ans = seq[0];
        for (int i : seq) {
            if (i > ans) ans = i;
        }
        return ans;
    }
}
