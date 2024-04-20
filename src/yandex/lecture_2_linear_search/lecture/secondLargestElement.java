package yandex.lecture_2_linear_search.lecture;

public class secondLargestElement {

    public int secondLargest(int[] arr) {
        int max1 = Integer.max(arr[0], arr[1]);
        int max2 = Integer.min(arr[0], arr[1]);
        for (int i : arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }
        }
        return Integer.min(max1, max2);
    }

}
