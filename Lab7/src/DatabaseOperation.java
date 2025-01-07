public interface DatabaseOperation {
    void insert(String record);
    void delete(String record);
    void update(String oldRecord, String newRecord);
    void read(String query);
}
        