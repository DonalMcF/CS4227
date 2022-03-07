package PlayerInput;

public class ButtonPressLeft implements ButtonPress{
    private String buttonPressed = "left";
		private String opposite = "right";

    public String getDirection(){
        return buttonPressed;
    }
	
	public String undo() {
		return opposite;
    }
}