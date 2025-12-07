package lesson3;

public class Practice {
    public static void main(String[] args) {
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isWorkWheel1 = true;
        boolean isWorkWheel2 = false;
        boolean isWorkWheel3 = false;
        boolean isWorkWheel4 = true;
        int wheelWork = (isWorkWheel1 ? 1 : 0) + (isWorkWheel2 ? 1 : 0) + (isWorkWheel3 ? 1 : 0) + (isWorkWheel4 ? 1 : 0);

        if (isWorkEngine && isWorkTransmission && (wheelWork >= 3)){
            System.out.println("Машина працює");
        } else System.out.println("Ноу");
    }
}
