
public class File extends FileSystemComponent {
    private long size;

    public File(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void printStructure(String prefix) {
        System.out.println(prefix + "- " + name + " (" + size + " bytes)");
    }

    @Override
    public long getSize() {
        return size;
    }
}
