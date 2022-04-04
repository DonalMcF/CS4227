package PlayerInput;


public class LeftCommand implements ICommand {
	MovementDirection MovementDirection;
	
	public LeftCommand( MovementDirection MovementDirection) {
		super();
		this.MovementDirection = MovementDirection;
	}
	
	public boolean execute() {
		MovementDirection.moveLeft();
		System.out.println("You move West");
		return true;
	}
}