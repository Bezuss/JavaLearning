package lesson2;

public class Math {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;


        // Додавання
        int sum = x + y;
        System.out.println(sum);

        // Віднімання
        int dif = x - y;
        System.out.println(dif);

        // Множення
        int mult = x * y;
        System.out.println(mult);

        // Ділення
        y = 3;
        double div = (double) x / y; // Дабл в душках перероблює int в double
        System.out.println(div);

        // Підношення до степеня

        int ext = x * x;
        System.out.println(ext);

        // Інкрізмент
        x = x + 1;
        x++;

    }

}
