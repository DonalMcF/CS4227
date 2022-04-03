package PlayerInput;

public class GameRemote {
	ICommand command;
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void buttinPressed() {
		command.execute();
	}
	
}