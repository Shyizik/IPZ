public class RealDatabaseOperation implements DatabaseOperation {
    @Override
    public void insert(String record) {
                System.out.println("Додано запис: " + record);
            }
            @Override
            public void delete(String record) {
                System.out.println("Видалено запис: " + record);
            }
            @Override
            public void update(String oldRecord, String newRecord) {
                System.out.println("Оновлено запис: " + oldRecord + " на " + newRecord);
    }
    @Override
    public void read(String query) {
                System.out.println("Читання за запитом: " + query);
            }
}
        