/**
 * Клас примітива (лінії).
 */
public class Line implements Graphic {
    private final int x1, y1, x2, y2;
    private final String color;

    public Line(int x1, int y1, int x2, int y2, String color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Малювання лінії кольору %s з координатами: (%d, %d) -> (%d, %d)%n",
                color, x1, y1, x2, y2);
    }
}
