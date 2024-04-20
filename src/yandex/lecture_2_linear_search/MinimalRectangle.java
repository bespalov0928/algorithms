package yandex.lecture_2_linear_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimalRectangle {

    //На клетчатой плоскости закрашено K клеток.
    //Требуется найти минимальный по площади прямоугольник, со сторонами, параллельными линиям сетки, покрывающий все закрашенные клетки.
    //https://contest.yandex.ru/contest/59540/problems/?success=112550565#30404/2024_03_02/m1fSEfUHs4

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer k = Integer.valueOf(br.readLine());
        String[] str = br.readLine().split(" ");
        int minx = Integer.valueOf(str[0]);
        int miny = Integer.valueOf(str[1]);
        int maxx = minx;
        int maxy = miny;

        for (int index = 2; index <= k; index++) {
            String[] str_ = br.readLine().split(" ");
            int x = Integer.valueOf(str_[0]);
            int y = Integer.valueOf(str_[1]);

            minx = Math.min(minx, x);
            miny = Math.min(miny, y);
            maxx = Math.max(maxx, x);
            maxy = Math.max(maxy, y);

        }
        System.out.println(String.format("%s %s %s %s", minx, miny, maxx, maxy));
    }

    public String Start(String[] arr) {
        Integer k = Integer.valueOf(arr[0]);
        String[] str = arr[1].split(" ");
        int minx = Integer.valueOf(str[0]);
        int miny = Integer.valueOf(str[1]);
        int maxx = minx;
        int maxy = miny;

        for (int index = 2; index <= k; index++) {
            String[] str_ = arr[index].split(" ");
            int x = Integer.valueOf(str_[0]);
            int y = Integer.valueOf(str_[1]);

            minx = Math.min(minx, x);
            miny = Math.min(miny, y);
            maxx = Math.max(maxx, x);
            maxy = Math.max(maxy, y);

        }
        return String.format("%s %s %s %s", minx, miny, maxx, maxy);
    }

}
