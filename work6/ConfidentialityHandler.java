package work6;
/**
 * Обробник перевірки конфіденційності.
 */
public class ConfidentialityHandler extends BaseHandler {
    @Override
    public void handle(Document doc) {
        if (!doc.isConfidential) {
            System.out.println("Помилка: Документ не є конфіденційним.");
            return;
        }
        System.out.println("Перевірка конфіденційності пройдена.");
        handleNext(doc);
    }
}