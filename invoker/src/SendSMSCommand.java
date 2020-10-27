public class SendSMSCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Sending SMS");
    }

    @Override
    public String getName() {
        return "SMS";
    }
}
