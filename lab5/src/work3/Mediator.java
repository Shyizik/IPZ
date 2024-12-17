package work3;

/**
 * Клас-посередник для керування взаємодією між таблицями.
 */
public class Mediator {
    private RelationalTable primaryTable;
    private RelationalTable foreignTable;

    public Mediator(RelationalTable primaryTable, RelationalTable foreignTable) {
        this.primaryTable = primaryTable;
        this.foreignTable = foreignTable;
    }

    public void insertWithForeignKey(int primaryId, String primaryData, int foreignId) {
        if (foreignTable.checkForeignKey(foreignId)) {
            primaryTable.insertRecord(primaryId, primaryData);
            System.out.println("Запис успішно додано із зовнішнім ключем " + foreignId);
        } else {
            System.out.println("Помилка: недійсний зовнішній ключ " + foreignId);
        }
    }
}
