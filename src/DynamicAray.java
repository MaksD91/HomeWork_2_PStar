import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicAray {

    static int max_size = 2;
    static int size = 0;
    static int[] data = new int[max_size];

    public static void main(String[] args) {
        System.out.println(isEmpty());
        add(9);
        System.out.println(isEmpty());
        add(5);
        add(3);
//        System.out.println(indexOf(2));
//        System.out.println(contains(3));
//        System.out.println(contains(4));
        add(4);
        add(1);
        add(7);
        add(8);
        add(2);
        System.out.println("Массив до сортировки: ");
        print();
        sort();
        System.out.println("Массив после сортировки: ");
        print();


    }

    static void print() {
        System.out.print("[ ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println(" ]");
    }

    static void add(int value) {
        if (size >= max_size) {
            int[] temp = Arrays.copyOf(data, size);
            max_size *= 2;
            data = new int[max_size];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
        data[size] = value;
        size++;

    }

    static boolean isEmpty() {
        return size == 0;
    }


    static boolean contains(int value) {

        return indexOf(value) >= 0;
    }

    static int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;

    }

    static int get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Индекс не найден.");
        }
        return data[index];
    }


    static void remove(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Индекс не найден.");
        }
        int[] temp = Arrays.copyOf(data, size);
        for (int i = index; i < temp.length - 1; i++) {
            data[i] = temp[i + 1];
        }
        data[temp.length - 1] = 0;
    }

    public static void sort() {
        // Применяем сортировку пузырьком
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    // Меняем местами
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}