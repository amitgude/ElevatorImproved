
public class Floor{
    private int currentFloor ; 
	Door  door  = new Door();
	 
	public Floor(){
		currentFloor = 0  ;
		
	}
	
	
	public Integer getCurrentFloorNumber() {
		return currentFloor;
	}

	// setter function for CurrentFloorNumber
	public void setCurrentFloorNumber(Integer currentFloorNumber) {
		this.currentFloor = currentFloorNumber;
	} 
	
	
}
