package work6;
/**
 * Абстрактний клас, що реалізує ланцюжок обробників.
 */
public abstract class BaseHandler implements DocumentHandler {
    protected DocumentHandler nextHandler;

    public void setNextHandler(DocumentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void handleNext(Document doc) {
        if (nextHandler != null) {
            nextHandler.handle(doc);
        }
    }
}