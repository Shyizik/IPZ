/**
 * Основний клас для демонстрації роботи програми.
 */
public class VectorGraphicsEditor {
    public static void main(String[] args) {
        System.out.println("Малювання примітивів:");
        Graphic line1 = GraphicFactory.getLine(10, 20, 30, 40, "червоний");
        Graphic line2 = GraphicFactory.getLine(30, 40, 50, 60, "синій");

        line1.draw();
        line2.draw();

        System.out.println("\nМалювання композиції (Прямокутник):");
        CompositeGraphic rectangle = new CompositeGraphic();
        rectangle.add(GraphicFactory.getLine(20, 20, 60, 20, "червоний")); // Верхня сторона
        rectangle.add(GraphicFactory.getLine(60, 20, 60, 60, "синій"));    // Права сторона
        rectangle.add(GraphicFactory.getLine(60, 60, 20, 60, "червоний")); // Нижня сторона
        rectangle.add(GraphicFactory.getLine(20, 60, 20, 20, "синій"));    // Ліва сторона

        rectangle.draw();

        System.out.println("\nМалювання композиції (Трикутник):");
        CompositeGraphic triangle = new CompositeGraphic();
        triangle.add(GraphicFactory.getLine(40, 20, 20, 60, "червоний")); // Ліва сторона
        triangle.add(GraphicFactory.getLine(20, 60, 60, 60, "синій"));    // Основа
        triangle.add(GraphicFactory.getLine(60, 60, 40, 20, "червоний")); // Права сторона

        triangle.draw();
    }
}