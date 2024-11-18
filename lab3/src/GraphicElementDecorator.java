/**
 * Базовий клас-декоратор для графічних елементів.
 */
public abstract class GraphicElementDecorator implements GraphicElement {
    protected GraphicElement element;

    public GraphicElementDecorator(GraphicElement element) {
        this.element = element;
    }

    @Override
    public String draw() {
        return element.draw();
    }
}
