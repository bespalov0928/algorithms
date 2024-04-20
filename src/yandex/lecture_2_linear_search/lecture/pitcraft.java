package yandex.lecture_2_linear_search.lecture;

//Задача:
// Остров игрока представляет собой набор столбцов разной высоты,
// состоящих из блоков камня и окруженных морем.
// Над островом прошел дождь который заполнил водой все низины.
// Определить сколько осталось блоков воды в низинах

public class pitcraft {
    public int isleflood(int[] arr) {
        int maxPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxPos]) maxPos = i;
        }
        int ans = 0;
        int nown = 0;
        for (int i = 0; i < maxPos; i++) {
            if (arr[i] > nown) nown = arr[i];
            ans += nown - arr[i];
        }
        nown = 0;
        for (int i = arr.length - 1; i > maxPos; i--) {
            if (arr[i] > nown) nown = arr[i];
            ans += nown - arr[i];
        }
        return ans;
    }
}
