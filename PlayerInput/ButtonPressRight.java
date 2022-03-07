package PlayerInput;

public class ButtonPressRight implements ButtonPress{
    private String buttonPressed = "right";

	@Override
    public String getDirection(){
        return buttonPressed;
    }
	@Override
	public String undo() {
		return opposite;
    }
}