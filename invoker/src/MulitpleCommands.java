import java.util.List;
import java.util.stream.Collectors;

public class MulitpleCommands implements Command {

    private final List<Command> commands;

    public MulitpleCommands(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(command -> command.execute());
    }

    @Override
    public String getName() {
        return commands.stream().map(command -> command.getName()).collect(Collectors.joining(","));
    }
}
