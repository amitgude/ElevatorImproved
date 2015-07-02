
public class Elevator {

	Panel panel = new Panel();
	Door  door  = new Door();
	Floor floor = new Floor();
	
	String statusElevator;
	
	
	//elevator movement
	
	
	public void setFloor(int floorno){
		floor.setCurrentFloorNumber(floorno);
		
	}
	
	
	public String elevMove(int userCurrentFloor){
		 
		if (floor.getCurrentFloorNumber() > userCurrentFloor){
			statusElevator="down";
		}
		else if (floor.getCurrentFloorNumber() < userCurrentFloor){
			statusElevator="up";
		}
		
		floor.setCurrentFloorNumber(userCurrentFloor);
		
		
		floor.openFloorDoor(); // opening floor door 
		door.opendoor();        // opening elevator door 
		
		
		floor.closeFloorDoor();
		door.closedoor();
		
		return statusElevator;
	}
	
	public int getElevatorFloor(){
		return floor.getCurrentFloorNumber();
	}
	
	
	//method to call elevator
	public void callElevator(int currentFloor){
		floor.selectOption();
		String option = floor.getFloorOption();
		
		if (option.equalsIgnoreCase("up")){
			elevMove(currentFloor);
			
		}
		else if (option.equalsIgnoreCase("down")){
			elevMove(currentFloor);
		}
	}
	
	
	//method to change floor
	public String changeFloor(){
	    panel.Click();
		if ( getElevatorFloor() > panel.getSelectedFloor() ){
			statusElevator="down";
		}
		else if ( getElevatorFloor() < panel.getSelectedFloor()){
			statusElevator="up";
		}
		
		
		floor.setCurrentFloorNumber(panel.getSelectedFloor());
		
		floor.openFloorDoor(); // opening floor door 
		door.opendoor();        // opening elevator door 
		
		floor.closeFloorDoor();
		door.closedoor();
		
		//System.out.println("You are on floor: "+floor.getCurrentFloorNumber());
		return statusElevator;
		
	}
	
	
	
}
