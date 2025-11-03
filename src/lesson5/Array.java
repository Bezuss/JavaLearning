package lesson5;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // Ссилочні типи даних
        int x = 5;
        int y = 10;
        int[] array = new int[2]; //создал массив
        System.out.println(array); // не воркає, получаємо тільки [I@2a84aee7, тільки ссилку
        System.out.println(Arrays.toString(array)); // не воркає, получаємо тільки [0, 0], бо не додали нічо до масиву
        array[0] = x;
        array[1] = y;
        System.out.println(Arrays.toString(array)); // Воркає як нада

        int[] array2 = new int[]{x, y}; //коротший спосіб
        System.out.println(Arrays.toString(array2)); // Воркає як нада

        int[] array3 = {x, y}; // Ще коротший спосіб
        System.out.println(Arrays.toString(array3)); // Воркає як нада

        System.out.println(array[0]); // Без конверта дізнаємось про значення яке знаходиться в елементі

        // Перенесення данних з одного масиву в інший (неправильне)
        int[] array4 = array2;
        System.out.println(Arrays.toString(array4)); // Вивидить копiю всьо гуд
        System.out.println(Arrays.toString(array2));

        // Замiна значення
        array4 = array2;
        array2[0] = 13;
        System.out.println(Arrays.toString(array4)); // Замiняеться значення двух, а не одного тому що це ссилочний тип данних i условний array4 просто копiюэ ссилку значення array2 якiй вiдсилаэться на один обьэкт
        System.out.println(Arrays.toString(array2));

        // Правильне перенесення даних одного з масивiв в iнший (правильне)
        int[] array5 = new int[2];
        array5[0] = array2[0];
        array2[0] = 14;
        System.out.println(Arrays.toString(array5));
        System.out.println(Arrays.toString(array2));

        // Практичне завдання
    }

}
