package work3;

/**
 * Інтерфейс Table для визначення загальних методів таблиць.
 */
public interface Table {
    void insertRecord(int id, String data);
    void updateRecord(int id, String data);
    void deleteRecord(int id);
}
