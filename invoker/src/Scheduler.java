public class Scheduler implements Invoker {
    @Override
    public void invoke(Command command) {
        System.out.println("Invoking " + command.getName());
        command.execute();
    }
}
