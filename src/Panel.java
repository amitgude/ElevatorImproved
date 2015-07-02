


public class Panel {

	Button buttons = new Button();
	
	
	public void setSelectedFloor(int  floorno){
		buttons.setValue(floorno);
		
	}

	
	public int getSelectedFloor(){
		return buttons.getValue();
	}
}
