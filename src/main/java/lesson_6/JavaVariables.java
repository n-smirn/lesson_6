package lesson_6;

public class JavaVariables {
    public static void main(String[] args) {

        int a = 15;
        int b = 25;
        int c = a + b;

        //арифметические
        System.out.println("a + b = " + (a + b));
        System.out.println("a = " + a);
        a += 7;
        System.out.println("a = " + a);
        System.out.println("a-b = " + (b - a));
        System.out.println("a*b = " + (a * b));
        System.out.println("a/b = " + (a / b));
        System.out.println("a%b = " + (a % b));
        System.out.println("c + b - a / (a + b) = " + (c + b - a / (a + b)));

        //сравнение
        System.out.println("a == c is " + (c == a));
        System.out.println("a != c is " + (a != c));
        System.out.println("a > b is " + (a > b));
        System.out.println("a >= b is " + (a >= b));

        //переполнение
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue + 1 = " + (maxValue + 1));

        //логические
        boolean x = true;
        boolean y = false;

        System.out.println("!x = " + !x);
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));

        //типы данных
        double d = 5.02;
        int e = 12312321;
        float f = e;
        System.out.println("c + d = " + (c + d));
        System.out.println("f - d " + (f - d));
        System.out.println("f = " + (f));

        //if else
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
        if (a < b) {
            System.out.println("a is less than b");
        }
    }
}