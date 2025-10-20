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

        // Коротка форма
        x++;
        x += 10;
        x *= 10;
        x /= 2;

        // Дікрізмент

        x = x - 1;
        x--;

        // Остача від ділення

        int modulo = 4 % 2; // Остача буде 0, тому число є чотним
        int modulo2 = 5 % 2; // Остача буде 1, тому число є нечотним

        // Скобки

        int brackets = 2 + 2 * 2; // буде 6
        int brackets2 = (2 + 2) * 2; // буде 8

        //Практичне завдання

        double height = 1.75;
        int weight = 75;
        double index = weight / (height*height);
        System.out.println(index);
    }

}
