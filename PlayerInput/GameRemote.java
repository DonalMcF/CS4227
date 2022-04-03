package PlayerInput;

public class GameRemote {
	iCommand command;
	
	public void setCommand(ICommand command) {
		this command = command;
	}
	
	public void buttinPressed() {
		command.execute();
	}
	
}