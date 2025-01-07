public class DatabaseTransactionProxy implements DatabaseOperation {
    private RealDatabaseOperation realOperation;
    public DatabaseTransactionProxy() {
                this.realOperation = new RealDatabaseOperation();
            }@Override
    public void insert(String record) {
        System.out.println("Початок транзакції для вставки.");
        realOperation.insert(record);
        System.out.println("Завершення транзакції для вставки.");
    }
    @Override
    public void delete(String record) {
        System.out.println("Початок транзакції для видалення.");
        realOperation.delete(record);
        System.out.println("Завершення транзакції для видалення.");
    }
    @Override
    public void update(String oldRecord, String newRecord) {
        System.out.println("Початок транзакції для оновлення.");
        realOperation.update(oldRecord, newRecord);
        System.out.println("Завершення транзакції для оновлення.");
    }
    @Override
    public void read(String query) {
        System.out.println("Читання без транзакції.");
        realOperation.read(query);
    }
}
        