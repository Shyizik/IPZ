/**
 * Декоратор для додавання текстури.
 */
public class TextureDecorator extends GraphicElementDecorator {
    private String texture;

    public TextureDecorator(GraphicElement element, String texture) {
        super(element);
        this.texture = texture;
    }

    @Override
    public String draw() {
        System.out.println("TextureDecorator: Adding texture " + texture);
        return super.draw() + " with texture: " + texture;
    }
}
