package HW18;

import java.util.List;

public class Utils {
    public Utils() {
    }

    static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {5, 7, 2, 0};
        System.out.println(findMax(arrayInt));

        String[] arrayString = {"a", "j", "8"};
        System.out.println(findMax(arrayString));
        List<Integer>integerList=List.of(1,2,4,6,7);
        printList(integerList);
        System.out.println(sumList(integerList));
    }
//    Завдання 3: Робота з Wildcards

    static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number element : list) {
            sum += element.doubleValue();
        }

        return sum;
    }
}


