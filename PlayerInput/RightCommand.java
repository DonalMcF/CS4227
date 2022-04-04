package PlayerInput;

public class RightCommand implements ICommand {
	MovementDirection MovementDirection;
	
	public RightCommand( MovementDirection MovementDirection) {
		super();
		this.MovementDirection = MovementDirection;
	}
	
	public boolean execute() {
		MovementDirection.moveRight();
		System.out.println("You move East");
		return true;
	}
}