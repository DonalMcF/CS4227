package PlayerInput;

public class ButtonPressEnter implements ButtonPress{
    private String buttonPressed = "enter";
		private String opposite = "return";

    public String getDirection(){
        return buttonPressed;
    }
	
	public String undo() {
		return opposite;
    }
}