/**
 * Головний клас для тестування графічних елементів та декораторів.
 */
public class Main {
    /**
 * @author Bohdan Yukhymchuk
 */
    public static void main(String[] args) {
        // Створення базового прямокутника
        GraphicElement rectangle = new Rectangle();

        // Додавання кольорового фону
        GraphicElement coloredRectangle = new ColorFillDecorator(rectangle, "red");

        // Додавання градієнта
        GraphicElement gradientRectangle = new GradientFillDecorator(coloredRectangle, "linear-gradient");

        // Додавання текстури
        GraphicElement texturedRectangle = new TextureDecorator(gradientRectangle, "brick-pattern");

        // Малювання прямокутника з ефектами
        System.out.println(texturedRectangle.draw());

        // Інший приклад: Коло з ефектами
        GraphicElement circle = new Circle();
        GraphicElement styledCircle = new TextureDecorator(
                new GradientFillDecorator(
                        new ColorFillDecorator(circle, "blue"),
                        "radial-gradient"
                ),
                "wood-pattern"
        );
        System.out.println(styledCircle.draw());
    }
}
