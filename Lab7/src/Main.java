/**
 * Клас Main для тестування реалізації проекту.
 */
public class Main {
    public static void main(String[] args) {
        // Тестування шаблону Command
        Command action1 = new ActionCommand("Дія 1");
        Command action2 = new ActionCommand("Дія 2");
        MacroCommand macro = new MacroCommand();
        macro.addCommand(action1);
        macro.addCommand(action2);

        Button button = new Button(macro);
        button.click();

        // Тестування шаблону Proxy
        DatabaseOperation dbProxy = new DatabaseTransactionProxy();
        dbProxy.insert("Запис 1");
        dbProxy.read("SELECT * FROM table");
    }
}
