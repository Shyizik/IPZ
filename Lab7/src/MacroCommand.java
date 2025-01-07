import java.util.ArrayList;
import java.util.List;
public class MacroCommand implements Command {
    private List<Command> commands = new ArrayList<>();
    public void addCommand(Command command) {
                commands.add(command);
            }
            @Override
            public void execute() {
                System.out.println("Виконання макрокоманди:");
                for (Command command : commands) {
                    command.execute();
                }
    }
}
        