import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        String text = "1) В тексте, который вы видите на этом изображении,\n" +
                "посчитайте количество букв \"е\" в каждом слове.\n" +
                "2) Напишите регулярное выражение для проверки\n" +
                "телефона в международном формате.\n" +
                "3) С помощью регулярного выражения, напишите\n" +
                "функцию удаления всех пробелов и букв из текста.";
        char letterToFind = 'е';

        // Вызываем метод и выводим результат
        int occurrences = valueСounter(text, letterToFind);
        System.out.println("Буква '" + letterToFind + "' встречается " + occurrences + " раз(а) в тексте.");

        // Задание 2: валидация номера телефона.
        String phoneNumber1 = "+12345678901234"; // Пример валидного номера
        String phoneNumber2 = "123456";// Пример невалидного номера

        System.out.println("Номер " + phoneNumber1 + " валиден: " + isValidPhone(phoneNumber1));
        System.out.println("Номер " + phoneNumber2 + " валиден: " + isValidPhone(phoneNumber2));

        //Задание 3. Удаление всех букв и значений из текста.

        // Удаляем буквы и пробелы
        String cleanedString = removeLetters(text);

        // Выводим результирующую строку
        printResult(cleanedString);

    }


    public static int valueСounter(String text, char letter) {
        int count = 0;

        // Приводим текст к нижнему регистру для нечувствительного поиска
        String lowerCaseText = text.toLowerCase();
        char lowerCaseLetter = Character.toLowerCase(letter);

        for (int i = 0; i < lowerCaseText.length(); i++) {
            if (lowerCaseText.charAt(i) == lowerCaseLetter) {
                count++;
            }
        }
        return count;
    }

    public static boolean isValidPhone(String phoneNumber) {
        String regex = "^\\+[1-9]\\d{1,14}$";
        return Pattern.matches(regex, phoneNumber);

    }

    public static String removeLetters(String text) {
        // Используем регулярное выражение для удаления букв и пробелов
        return text.replaceAll("[а-яА-ЯёЁ\\s]", "");
    }

    // Метод для вывода итоговой строки
    public static void printResult(String result) {
        System.out.println("Результат после удаления букв и пробелов: " + result);
    }


}
