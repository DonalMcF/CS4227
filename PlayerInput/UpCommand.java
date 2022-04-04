package PlayerInput;

public class UpCommand implements ICommand {
	MovementDirection MovementDirection;
	
	public UpCommand( MovementDirection MovementDirection) {
		super();
		this.MovementDirection = MovementDirection;
	}
	
	public boolean execute() {
		MovementDirection.moveUp();
		System.out.println("You move North");
		return true;
	}
}