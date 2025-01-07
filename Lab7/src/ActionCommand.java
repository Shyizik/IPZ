public class ActionCommand implements Command {
    private String actionName;
    public ActionCommand(String actionName) {
                this.actionName = actionName;
            }
            @Override
            public void execute() {
                System.out.println("Виконання дії: " + actionName);
            }
}
        