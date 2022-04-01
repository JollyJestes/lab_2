package com.company;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана последовательность вещественных чисел, оканчивающаяся числом 10 000.
 * Количество чисел в последовательности не меньше двух.
 * Определить, является ли последовательность упорядоченной по возрастанию.
 * В случае отрицательного ответа определить порядковый номер первого числа, нарушающего такую упорядоченность.
 */
public class Main {

    public static void main(String[] args) {
        task86();
    }

    private static void task86() {
        //init
        byte sortedCheck = 0;
        int notSortedPosition = 0;
        int[] array = new int[(int) (Math.random() * 5 + 2)];
        array[(array.length - 1)] = 10000;

        //fill array
        for (int i = 0; i < (array.length - 2); i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }

        //sort check
        for (int i = 0; i < (array.length - 2); i++) {
            if (array[i] > array[i + 1]) {
                sortedCheck = 1;
                notSortedPosition = (i + 1);
            }
            if (sortedCheck == 1)
                break;
        }

        //check result
        System.out.println("Array -> " + Arrays.toString(array));
        if (sortedCheck == 0)
            System.out.println("Array sorted");
        else
            System.out.println("Array not sorted.\n First non sorted element on position -> " + (notSortedPosition + 1));

    }
}

/**
 * Задан целочисленный массив с количеством элементов n.
 * Сжать массив, выбросив из него каждый второй элемент.
 * Дополнительный массив не использовать.
 */
class lab {
    public static void main(String[] args) {

        task136();

    }

    private static void task136() {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 2; i < arr.length; i += 2) {
            arr[i / 2] = arr[i];
        }
        int newSize = arr.length / 2;
        if (arr.length % 2 != 0) {
            newSize += 1;
        }

        System.out.println(Arrays.toString(arr));
    }
}

/**
 * На k-e место одномерного массива вещественных чисел вставить элемент,
 * равный среднему арифметическому элементов массива.
 */

class lab1 {
    public static void main(String[] args) {

        task111();

    }

    private static void task111() {
        Scanner scanner = new Scanner(System.in);
        double[] Mas = new double[10];
        for (int i = 0; i < (Mas.length); i++) {
            System.out.println("Enter number with index \t" + (i + 1));
            Mas[i] = scanner.nextInt();
        }
        System.out.println("Enter array element:");
        int k = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < Mas.length; i++) {
            sum += Mas[i];
            sum /= Mas.length;
            Mas[k] = sum;
        }

        for (int i = 0; i < Mas.length; i++) {
            System.out.println(Mas[i] + " ");
        }
    }
}

/**
 * Даны целые числа а1, а2, ..., an.
 * Вывести на печать только те числа, для которых выполняется условие ai ≥ i.
 */

class lab3 {
    public static void main(String[] args) {

        task36();

    }

    private static void task36() {
        int[] array = new int[(int) (Math.random() * 10 + 20)];
        int searchedValue = (int) (Math.random() * 20);


        for (int i = 0; i < (array.length); i++) {
            array[i] = ((int) (Math.random() * 20 - 5));
            if (array[i] >= i)
                System.out.println("Element (ai >= i) -> " + array[i]);
        }


        System.out.println("Array -> " + Arrays.toString(array));
    }
}

/**
 * Дано целое х и массив целых чисел А[1], ..., А[n],
 * которые отсортированы в порядке неубывания и уже находятся в памяти.
 * Найти такое значение i, что A[i] = x, или возвратить i = 0,
 * если элемента х в массиве нет.
 */
class lab4 {
    public static void main(String[] args) {

        task61();

    }

    private static void task61() {
        int[] array = new int[(int) (Math.random() * 10 + 20)];
        int searchedValue = (int) (Math.random() * 20);
        int searchedValuePosition = 0;


        for (int i = 0; i < (array.length); i++) {
            array[i] = ((int) (Math.random() * 20 - 5));
        }
        Arrays.sort(array);


        for (int i = 0; i < array.length; i++) {
            if (searchedValue == array[i]) {
                searchedValuePosition = (i + 1);  //index 1.......n
            }
        }


        System.out.println("Array -> " + Arrays.toString(array));
        if (searchedValuePosition == 0)
            System.out.println("Not found (" + searchedValue + ")");
        else
            System.out.println("Position of (" + searchedValue + ") -> " + searchedValuePosition);
    }
}
