package lesson3;

public class Scope {
    public static void main(String[] args) {
        // Закритість змінних, тобто змінна яка створена в середині якоїсь вимоги не запам'ятається поза нею
        double priceCar = 10_000;

        if (priceCar > 9000) {
            double oldprice = priceCar;
            priceCar *= 0.95;
            System.out.println(oldprice - priceCar);
        }

        System.out.println(priceCar);
    }
}
