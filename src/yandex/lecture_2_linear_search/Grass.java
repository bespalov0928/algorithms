package yandex.lecture_2_linear_search;

//Задача: Газон
//Трава подстрижена в прямоуголнике с углами (х1, y1) и (х2, y2). В каждой целой точкерастет пучок травы
//Круговой дождеватель установлен в (x3, y3), радиус r
//Сколько пучков подстрижено и полито

//import static java.lang.Math.sqrt;

public class Grass {

    public int grassStart(int x1, int y1, int x2, int y2, int x3, int y3, int r) {
        int ans = 0;
        for (int y = Integer.max(y1, y3 - r); y < Integer.min(y2, y3 + r)+1; y++) {
            int xDelta = (int) Math.sqrt(Math.pow(r, 2) - Math.pow((y - y3), 2));
            int xMax = (int) Math.min(x2, Math.floor(x3 + xDelta));
            int xMin = (int) Math.max(x1, Math.ceil(x3 - xDelta));
            if (xMax >= xMin) ans += xMax - xMin ;
        }
        return ans;
    }
}
