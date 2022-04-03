package PlayerInput;
import ICommand;
public class ReturnCommand implements ICommand {
	ButtonPress ButtonPress;
	
	public DownCommand( ButtonPress ButtonPress) {
		super();
		this.ButtonPress = ButtonPress;
	}
	
	public void execute() {
		System.out.println("Pressed Return");
		ButtonPress.pressReturn();
	}
}