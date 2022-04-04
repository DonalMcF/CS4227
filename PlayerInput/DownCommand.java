package PlayerInput;


public class DownCommand implements ICommand {
	MovementDirection MovementDirection;
	
	public DownCommand( MovementDirection MovementDirection) {
		super();
		this.MovementDirection = MovementDirection;
	}
	
	public boolean execute() {
		MovementDirection.moveDown();
		System.out.println("You move South");
		return true;
	}
}