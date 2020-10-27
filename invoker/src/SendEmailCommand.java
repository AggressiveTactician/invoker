public class SendEmailCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Sending email");
    }

    @Override
    public String getName() {
        return "email";
    }
}
