package PlayerInput;
import ICommand;
public class ReturnCommand implements ICommand {
	ButtonPress ButtonPress;
	
	public ReturnCommand( ButtonPress ButtonPress) {
		super();
		this.ButtonPress = ButtonPress;
	}
	
	public void execute() {
		System.out.println("Pressed Return");
		ButtonPress.pressReturn();
	}
}