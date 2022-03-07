package PlayerInput;

public class ButtonPressUp implements ButtonPress{
    private String buttonPressed = "up";

	@Override
    public String getDirection(){
        return buttonPressed;
    }
	@Override
	public String undo() {
		return opposite;
    }
}
