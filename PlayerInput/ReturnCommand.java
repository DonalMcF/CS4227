package PlayerInput;

public class ReturnCommand implements ICommand {
	ButtonPress ButtonPress;
	
	public ReturnCommand( ButtonPress ButtonPress) {
		super();
		this.ButtonPress = ButtonPress;
	}
	
	public boolean execute() {
		ButtonPress.pressReturn();
		return false;
	}
}