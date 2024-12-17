package work6;
/**
 * Інтерфейс для обробників документів.
 */
public interface DocumentHandler {
    void handle(Document doc);

    void setNextHandler(DocumentHandler authorizationHandler);
}