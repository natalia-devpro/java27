package lesson2;

public class Main1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c = 6;

        if (a == b && b == c && c == a) {
            System.out.println("Это раВносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это раЗносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }


    }
}
