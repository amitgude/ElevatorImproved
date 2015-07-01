
public class Elevator {

	Panel panel = new Panel();
	Door  door  = new Door();
	Floor floor = new Floor();
	
	
	
	//elevator movement
	
	
	public void setFloor(int floorno){
		floor.setCurrentFloorNumber(floorno);
		
	}
	
	
	public void elevMove(int currentFloor){
		 
		if (floor.getCurrentFloorNumber() > currentFloor){
			System.out.println(" >>>>> Lift coming down");
		}
		else if (floor.getCurrentFloorNumber() < currentFloor){
			System.out.println(" >>>>> Lift coming up");
		}
		floor.openFloorDoor(); // opening floor door 
		door.opendoor();        // opening elevator door 
		floor.setCurrentFloorNumber(currentFloor);
		floor.closeFloorDoor();
		door.closedoor();
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
		else{
			System.out.println(" lift is on the same floor");
		}
		
		
		
	}
	
	//method to change floor
	public void changeFloor(){
	    panel.Click();
		if ( getElevatorFloor() > panel.getSelectedFloor() ){
			System.out.println(" lift is going down");
		}
		else if ( getElevatorFloor() < panel.getSelectedFloor()){
			System.out.println(" lift is going up");
		}
		else{
			System.out.println(" lift is on the same floor");
		}
		
		floor.setCurrentFloorNumber(panel.getSelectedFloor());
		floor.openFloorDoor(); // opening floor door 
		door.opendoor();        // opening elevator door 
		
		floor.closeFloorDoor();
		door.closedoor();
		
		System.out.println("You are on floor: "+floor.getCurrentFloorNumber());
		
	}
	
	
	
}
