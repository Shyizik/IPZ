package work3;

/**
 * Клас RelationalTable для роботи з таблицею.
 * Реалізує можливість перевірки зовнішнього ключа.
 */
public class RelationalTable implements Table {
    private String tableName;

    public RelationalTable(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public void insertRecord(int id, String data) {
        System.out.println("Вставка запису в таблицю " + tableName + ": id=" + id + ", data=" + data);
    }

    @Override
    public void updateRecord(int id, String data) {
        System.out.println("Оновлення запису в таблиці " + tableName + ": id=" + id + ", data=" + data);
    }

    @Override
    public void deleteRecord(int id) {
        System.out.println("Видалення запису з таблиці " + tableName + ": id=" + id);
    }

    public boolean checkForeignKey(int foreignKey) {
        System.out.println("Перевірка зовнішнього ключа: " + foreignKey);
        return foreignKey > 0; // Заглушка для перевірки
    }
}
