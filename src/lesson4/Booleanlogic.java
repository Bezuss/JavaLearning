package lesson4;

public class Booleanlogic {

    public static void main(String[] args) {
        //Логічні операції з boolean

        // син пішов за хлібом
        boolean isBoughtBread = true;

        // син купив ше молок
        boolean isBoughtMilk = false;

        // && - Логічне І

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Купив Хліб і Молоко");
        } else if (isBoughtMilk){
            System.out.println("Купив тікі молоко");
        } else if (isBoughtBread){
            System.out.println("Купив тікі хліб");
        }
        else System.out.println("Не купив нічо");

        // || - логічне або
        if (isBoughtBread || isBoughtMilk) {
            System.out.println("Синок купив або хліб, або Молоко");
        }else System.out.println("Нічо не купив");

        // != - логічне ні
        if(isBoughtMilk != true){
            System.out.println("Молодець шо не купив");
        }else System.out.println("а зач?");
    }
}
