package work6;
/**
 * Обробник перевірки формату документа.
 */
public class FormatHandler extends BaseHandler {
    @Override
    public void handle(Document doc) {
        if (!"PDF".equalsIgnoreCase(doc.format)) {
            System.out.println("Помилка: Неправильний формат документа.");
            return;
        }
        System.out.println("Перевірка формату пройдена.");
        handleNext(doc);
    }
}