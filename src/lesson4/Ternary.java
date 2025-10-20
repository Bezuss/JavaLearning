package lesson4;

public class Ternary {
    public static void main(String[] args) {
        // Тернарний оператор
        int money = 100;
        int breadPrice = 20;
        int moneyAfterShoppping =  money - breadPrice;
        int childMoney = moneyAfterShoppping >= 50 ? 10 : 5; // зміна, =, випадок, після випадку йде ?, після нього маємо вказати що буде в випадку true, а потім : і те що буде, якщо false
        moneyAfterShoppping -= childMoney;
        System.out.println(moneyAfterShoppping);

    }
}
