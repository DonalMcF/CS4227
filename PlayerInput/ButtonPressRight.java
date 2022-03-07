package PlayerInput;

public class ButtonPressRight implements ButtonPress{
    private String buttonPressed = "right";

    public String getDirection(){
        return buttonPressed;
    }
	
	public String undo() {
		return opposite;
    }
}