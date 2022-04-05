package PlayerInput;

public class EnterCommand implements ICommand {
	ButtonPress ButtonPress;
	
	public EnterCommand( ButtonPress ButtonPress) {
		super();
		this.ButtonPress = ButtonPress;
	}
	
	public boolean execute() {
		ButtonPress.pressEnter();
		return true;
	}
}