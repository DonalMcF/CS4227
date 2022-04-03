package PlayerInput;
//import ICommand;

public class EnterCommand implements ICommand {
	ButtonPress ButtonPress;
	
	public EnterCommand( ButtonPress ButtonPress) {
		super();
		this.ButtonPress = ButtonPress;
	}
	
	public void execute() {
		System.out.println("Pressed Enter");
		ButtonPress.pressEnter();
	}
}