package PlayerInput;

public class ButtonPressDown implements ButtonPress{
    private String buttonPressed = "down";
	private String opposite = "up";

    public String getDirection(){
        return buttonPressed;
    }
	
	public String undo() {
		return opposite;
    }
}