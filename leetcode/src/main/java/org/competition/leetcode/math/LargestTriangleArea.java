package org.competition.leetcode.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LargestTriangleArea {

    class Point {
        int x;
        int y;



        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public int distance(Point other) {
            return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
        }
    }


    public double largestTriangleArea(int[][] points) {
//        List<Point> p = new ArrayList<>();
//        for(int [] point : points) {
//            p.add(new Point(point[0], point[1]));
//        }
//        Collections.sort(p, (a, b) ->
//             a.getX() > b.getX() || a.getY() > b.getY() ? 1 :
//                    a.getX() < b.getX() || a.getY() < b.getY() ? -1 : 0
//        );
//        System.out.println("p = " + p);
//        Point vertex = p.get(0);
//        System.out.println("vertex = " + vertex);
//        Point base1 = p.get(p.size() - 2);
//        System.out.println("base1 = " + base1);
//        Point base2 = p.get(p.size() - 1);
//        System.out.println("base2 = " + base2);
//        return 0.5 * (vertex.y * Math.abs(base2.x - base1.x) +
//                base1.y * Math.abs(base2.x - vertex.x) +
//                base2.y * Math.abs(vertex.x - base1.x));
        double res = 0;
        for (int[] i: points) {
            for (int[] j: points) {
                for (int[] k: points) {
                    res = Math.max(res, 0.5 * Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1]- j[0] * i[1] - k[0] * j[1] - i[0] * k[1]));
                }
            }
        }

        return res;
    }
}
