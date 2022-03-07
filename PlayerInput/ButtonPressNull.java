package PlayerInput;

public class ButtonPressNull implements ButtonPress{
    private String buttonPressed = "null";
	private String opposite = "null";

	@Override
    public String getDirection(){
        return buttonPressed;
    }
	@Override
	public String undo() {
		return opposite;
    }
}