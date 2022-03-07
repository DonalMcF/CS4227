package PlayerInput;

public class ButtonPressUp implements ButtonPress{
    private String buttonPressed = "up";

    public String getDirection(){
        return buttonPressed;
    }
	
	public String undo() {
		return opposite;
    }
}
