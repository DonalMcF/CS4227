package PlayerInput;

public class GameRemote {
	ICommand command;
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public boolean buttonPressed() {
		return command.execute();
	}
	
}