/**
 * Декоратор для додавання кольорового заповнення.
 */
public class ColorFillDecorator extends GraphicElementDecorator {
    private String color;

    public ColorFillDecorator(GraphicElement element, String color) {
        super(element);
        this.color = color;
    }

    @Override
    public String draw() {
        System.out.println("ColorFillDecorator: Adding color fill " + color);
        return super.draw() + " with color fill: " + color;
    }
}
