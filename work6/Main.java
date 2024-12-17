package work6;

public class Main {
    public static void main(String[] args) {
        // Створення обробників
        DocumentHandler formatHandler = new FormatHandler();
        DocumentHandler authorizationHandler = new AuthorizationHandler();
        DocumentHandler confidentialityHandler = new ConfidentialityHandler();
        DocumentHandler submissionTimeHandler = new SubmissionTimeHandler();

        // Формування ланцюжка обробників
        formatHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(confidentialityHandler);
        confidentialityHandler.setNextHandler(submissionTimeHandler);

        // Створення документів
        Document validDocument = new Document("PDF", true, true, true);
        Document invalidDocument = new Document("DOC", true, false, true);

        System.out.println("=== Перевірка валідного документа ===");
        formatHandler.handle(validDocument);

        System.out.println("\n=== Перевірка невалідного документа ===");
        formatHandler.handle(invalidDocument);
    }
}