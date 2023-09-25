package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x3 = x2 - x1;
        int y3 = y2 - y1;
        double first = Math.pow(x3, 2);
        double second = Math.pow(y3, 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(1, 1, 41, 1);
        System.out.println("result (1, 1) to (41, 1) " + result);
        result = Point.distance(25, 0, 75, 0);
        System.out.println("result (25, 0) to (75, 0) " + result);
    }
}