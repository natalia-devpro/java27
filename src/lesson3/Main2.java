package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 7, 8, 9};
//        System.out.println(numbers[5]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[1]);

        for (int i = 5; i >= 1; i = i - 2) {
            System.out.println(numbers[i]);
        }


    }
}
