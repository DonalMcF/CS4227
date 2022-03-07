package PlayerInput;

public class PlayerInputState{
	
	private static ButtonPress State = new ButtonPressNull();
	
	public static void changeInState(String buttonInput){ 
		switch(buttonInput){
			case "up": State = new ButtonPresedUp(); break;
			case "down": State = new ButtonPresedDown(); break;
			case "right": State = new ButtonPresedRight(); break;
			case "left": State = new ButtonPresedLeft(); break;
			case "enter": State = new ButtonPresedEnter(); break;
			case "return": State = new ButtonPresedReturn(); break;
		}	
}