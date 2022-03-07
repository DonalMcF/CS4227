package PlayerInput;

public class ButtonPressReturn implements ButtonPress{
    private String buttonPressed = "return";
	private String opposite = "enter";

	@Override
    public String getDirection(){
        return buttonPressed;
    }
	@Override
	public String undo() {
		return opposite;
    }
}