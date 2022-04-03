package PlayerInput;
import ICommand;

public class UpCommand implements ICommand {
	MovementDirection MovementDirection;
	
	public DownCommand( MovementDirection MovementDirection) {
		super();
		this.MovementDirection = MovementDirection;
	}
	
	public void execute() {
		System.out.println("Moving Up");
		MovementDirection.moveUp();
	}
}