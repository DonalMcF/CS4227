package PlayerInput;
//import ICommand;

public class LeftCommand implements ICommand {
	MovementDirection MovementDirection;
	
	public LeftCommand( MovementDirection MovementDirection) {
		super();
		this.MovementDirection = MovementDirection;
	}
	
	public void execute() {
		System.out.println("Moving Left");
		MovementDirection.moveLeft();
	}
}