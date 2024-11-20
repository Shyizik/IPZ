
public class main {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        root.add(new File("file1.txt", 500));
        root.add(new File("file2.txt", 300));

        Folder subFolder = new Folder("SubFolder");
        subFolder.add(new File("subfile1.txt", 200));
        subFolder.add(new File("subfile2.txt", 100));

        Folder nestedFolder = new Folder("NestedFolder");
        nestedFolder.add(new File("nestedfile1.txt", 50));
        subFolder.add(nestedFolder);

        root.add(subFolder);

        System.out.println("Структура файлової системи:");
        root.printStructure("");

        System.out.println("\nЗагальний розмір кореневої папки: " + root.getSize() + " bytes");

        nestedFolder.add(new File("renamedfile.txt", 75));
        root.printStructure("");
    }
}
