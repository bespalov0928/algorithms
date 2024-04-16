package yandex.lecture_2_linear_search;

//Задача: упрощенная RLE
//Дана строка (возможно пустая) состоящая из букв A-Z:
//AAABBBBDFFFFFFFSSSSSSHHHH
//нужно написать функцию RLE, кторая на выходе даст строку вида
//A3B4DF7S6H4

import java.util.StringJoiner;

public class rle {
    public String rleStart(String str) {
        char[] charArr = str.toCharArray();
        char lastSym = charArr[0];
        int lastPos = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != lastSym) {
                ans.append(pack(lastSym, i - lastPos));
                lastSym = charArr[i];
                lastPos = i;
            }
        }
        ans.append(pack(lastSym, charArr.length - lastPos));
        return ans.toString();
    }

    private static String pack(Character str, int cnt) {
        StringBuilder stringBuilder = new StringBuilder();
        if (cnt > 1) return stringBuilder.append(str).append(cnt).toString();
        return str.toString();
    }
}
