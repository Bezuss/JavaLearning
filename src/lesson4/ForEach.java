package lesson4;

public class ForEach {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int[] numbers2 = {3, 2, 10, 5, 8};

        System.out.println("----------------------------");

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("----------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }

        //1
        System.out.println("----------------------------");
        for (int q : numbers2) {
            if(q % 2 == 0) {
                System.out.println(q);
            }
        }

        //2 Индекс делиться на 2
        System.out.println("----------------------------");
        for (int w = 0; w < numbers2.length; w++) {

            if(w % 2 == 0) {
                System.out.println(numbers2[w]);
            }

        }
    }


}
