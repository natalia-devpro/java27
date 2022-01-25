package lesson4;

public class Main1 {
    public static void main(String[] args) {
        String text = "Hello qwerty!!!";
        String lowerText = text.toLowerCase();
        System.out.println(text);
        System.out.println(lowerText);

        for(int i = 0; i < 1000; i++){
            text = text + "!" + i;
        }
        System.out.println(text);

    }
}
