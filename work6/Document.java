package work6;
/**
 * Клас для зберігання документів.
 */
public class Document {
    public String format;
    public boolean isAuthorized;
    public boolean isConfidential;
    public boolean isSubmittedOnTime;

    public Document(String format, boolean isAuthorized, boolean isConfidential, boolean isSubmittedOnTime) {
        this.format = format;
        this.isAuthorized = isAuthorized;
        this.isConfidential = isConfidential;
        this.isSubmittedOnTime = isSubmittedOnTime;
    }
}