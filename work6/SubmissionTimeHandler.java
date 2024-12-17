package work6;
/**
 * Обробник перевірки часу подання.
 */
public class SubmissionTimeHandler extends BaseHandler {
    @Override
    public void handle(Document doc) {
        if (!doc.isSubmittedOnTime) {
            System.out.println("Помилка: Документ подано невчасно.");
            return;
        }
        System.out.println("Перевірка часу подання пройдена.");
        handleNext(doc);
    }
}