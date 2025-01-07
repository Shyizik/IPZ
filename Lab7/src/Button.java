public class Button {
    private Command command;
    public Button(Command command) {
                this.command = command;
            }
            public void click() {
                System.out.println("Натиснуто кнопку.");
                command.execute();
    }
}
        