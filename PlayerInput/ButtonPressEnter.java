package PlayerInput;

public class ButtonPressEnter implements ButtonPress{
    private String buttonPressed = "enter";
		private String opposite = "return";

	@Override
    public String getDirection(){
        return buttonPressed;
    }
	@Override
	public String undo() {
		return opposite;
    }
}