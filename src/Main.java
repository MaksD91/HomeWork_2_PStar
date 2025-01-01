import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Расскажите о Вашем друге.");
        System.out.println("Как его зовут? Напишите имя в консоль.");
        Scanner Scanner = new Scanner(System.in);
        String name = Scanner.nextLine();

        System.out.println("Сколько ему лет ? ");
        int age = Scanner.nextInt();
        System.out.println("Моему другу "+ name + "у сейчас " + age + " лет/года.");
        Scanner.close();
    }
}