
public class Floor{
    private int currentFloor ; 
	Door  door  = new Door();
	FloorButton floorbutton = new FloorButton();
	
	Floor(){
		currentFloor = 0;
	}
	
	void selectOption(){
		floorbutton.selectOption();
	}
	
	public void openFloorDoor(){
		door.openFloordoor();
	}
	
	public void closeFloorDoor(){
		door.closeFloordoor();
	}
	
	public String getFloorOption(){
		return floorbutton.getOption();
	}
	
	public Integer getCurrentFloorNumber() {
		return currentFloor;
	}

	// setter function for CurrentFloorNumber
	public void setCurrentFloorNumber(Integer currentFloorNumber) {
		this.currentFloor = currentFloorNumber;
	} 
	
	
}
