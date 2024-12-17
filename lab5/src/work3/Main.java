package work3;

/**
 * Головний клас для демонстрації роботи системи.
 * @author Bohdan Yukhymchuk
 */
public class Main {
    public static void main(String[] args) {
        RelationalTable users = new RelationalTable("Users");
        RelationalTable orders = new RelationalTable("Orders");

        Mediator mediator = new Mediator(orders, users);

        // Демонстрація вставки записів із перевіркою зовнішнього ключа
        mediator.insertWithForeignKey(1, "Order1", 10);
        mediator.insertWithForeignKey(2, "Order2", -1); // Недійсний зовнішній ключ
    }
}
