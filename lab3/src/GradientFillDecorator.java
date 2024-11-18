/**
 * Декоратор для додавання градієнтного заповнення.
 */
public class GradientFillDecorator extends GraphicElementDecorator {
    private String gradient;

    public GradientFillDecorator(GraphicElement element, String gradient) {
        super(element);
        this.gradient = gradient;
    }

    @Override
    public String draw() {
        System.out.println("GradientFillDecorator: Adding gradient fill " + gradient);
        return super.draw() + " with gradient fill: " + gradient;
    }
}
