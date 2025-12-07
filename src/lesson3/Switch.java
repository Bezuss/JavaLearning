package lesson3;

public class Switch {
    public static void main(String[] args) {
        //1 - понеділок ... 7 - неділя
        int numberDay = 1;

        // Оператор світч
        switch (numberDay) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Неправильні вводні");
        }

        //Вираження світч
        System.out.println( switch(numberDay) {
            case 1 -> "Понеділок";
            case 2 -> "Вівторок";
            case 3 -> "Середа";
            default -> "Неправильні вводні";
        });
    }
}
