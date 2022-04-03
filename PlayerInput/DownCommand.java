package PlayerInput;
import ICommand;

public class DownCommand implements ICommand {
	MovementDirection MovementDirection;
	
	public DownCommand( MovementDirection MovementDirection) {
		super();
		this.MovementDirection = MovementDirection;
	}
	
	public void execute() {
		System.out.println("Moving Down");
		MovementDirection.moveDown();
	}
}