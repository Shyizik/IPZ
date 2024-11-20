
import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void printStructure(String prefix) {
        System.out.println(prefix + "+ " + name);
        for (FileSystemComponent component : children) {
            component.printStructure(prefix + "  ");
        }
    }

    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
