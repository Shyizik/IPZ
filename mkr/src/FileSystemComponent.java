
public abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printStructure(String prefix);

    public abstract long getSize();

    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Ця операція недоступна для цього елемента.");
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Ця операція недоступна для цього елемента.");
    }
}
