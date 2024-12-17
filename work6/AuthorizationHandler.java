package work6;
/**
 * Обробник перевірки авторизації.
 */
public class AuthorizationHandler extends BaseHandler {
    @Override
    public void handle(Document doc) {
        if (!doc.isAuthorized) {
            System.out.println("Помилка: Документ не авторизований.");
            return;
        }
        System.out.println("Перевірка авторизації пройдена.");
        handleNext(doc);
    }
}