package PlayerInput;
//import ICommand;

public class RightCommand implements ICommand {
	MovementDirection MovementDirection;
	
	public RightCommand( MovementDirection MovementDirection) {
		super();
		this.MovementDirection = MovementDirection;
	}
	
	public void execute() {
		System.out.println("Moving Right");
		MovementDirection.moveRight();
	}
}