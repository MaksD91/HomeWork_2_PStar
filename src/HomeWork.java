import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

        int limit = 15;

        for (int i = 0; i <= limit; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i !=0) {
                System.out.print("fizzbuzz ");
            } else if (i % 3 == 0 && i !=0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0 && i !=0) {
                System.out.print("buzz ");
            } else {
                System.out.print(i + " ");
            }

        }
    }
}
