package PlayerInput;

public class ButtonPressLeft implements ButtonPress{
    private String buttonPressed = "left";
		private String opposite = "right";

	@Override
    public String getDirection(){
        return buttonPressed;
    }
	@Override
	public String undo() {
		return opposite;
    }
}