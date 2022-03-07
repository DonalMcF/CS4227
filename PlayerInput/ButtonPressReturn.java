package PlayerInput;

public class ButtonPressReturn implements ButtonPress{
    private String buttonPressed = "return";
		private String opposite = "enter";

    public String getDirection(){
        return buttonPressed;
    }
	
	public String undo() {
		return opposite;
    }
}