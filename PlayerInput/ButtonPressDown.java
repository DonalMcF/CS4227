package PlayerInput;

public class ButtonPressDown implements ButtonPress{
    private String buttonPressed = "down";
	private String opposite = "up";

	@Override
    public String getDirection(){
        return buttonPressed;
    }
	@Override
	public String undo() {
		return opposite;
    }
}