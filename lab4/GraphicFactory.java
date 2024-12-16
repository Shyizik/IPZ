import java.util.HashMap;
import java.util.Map;

/**
 * Фабрика Flyweight для графічних об'єктів.
 */

public class GraphicFactory {
    private static final Map<String, Line> lineCache = new HashMap<>();

    public static Line getLine(int x1, int y1, int x2, int y2, String color) {
        String key = x1 + ":" + y1 + ":" + x2 + ":" + y2 + ":" + color;
        if (!lineCache.containsKey(key)) {
            lineCache.put(key, new Line(x1, y1, x2, y2, color));
            System.out.println("Створено новий об'єкт лінії: " + key);
        }
        return lineCache.get(key);
    }
}
