import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Invoker invoker = new Scheduler();
        Command command = new SendSMSCommand();
//        invoker.invoke(command);

        Command command1 = new SendEmailCommand();
//        invoker.invoke(command1);

        Command multipleCommands = new MulitpleCommands(Arrays.asList(command, command1));
        invoker.invoke(multipleCommands);

    }
}
