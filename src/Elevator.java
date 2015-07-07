
public class Elevator {

	Panel panel = new Panel();
	Door  door  = new Door();
	Floor floor = new Floor();
	
	String elevStatus;
	private static Elevator instance = null;
	//elevator movement
	
	
	private Elevator(){
		
	}
	
	public static Elevator getElevatorInstance(){
		
		if ( instance == null){
			instance = new Elevator();
		}
		else{
			return instance;
		}
		
		return instance;
	}
	
	public void setFloor(int floorno){
		floor.setCurrentFloorNumber(floorno);
		
	}
	
	
	public String elevMove(int currentFloor){
		 
		if (floor.getCurrentFloorNumber() > currentFloor){
			elevStatus = "down";
		}
		else if (floor.getCurrentFloorNumber() < currentFloor){
			elevStatus = "up";
		}
		floor.setCurrentFloorNumber(currentFloor);
		
		floor.openFloorDoor(); // opening floor door 
		door.opendoor();        // opening elevator door 
		
		floor.closeFloorDoor();
		door.closedoor();
		
		return elevStatus;
	}
	
	public int getElevatorFloor(){
		return floor.getCurrentFloorNumber();
	}
	
	//method to call elevator

	
	public String  callElevator(int currentFloor , String opt ){
		floor.selectOption(opt);

		String option = floor.getFloorOption();
		
		if (option.equalsIgnoreCase("up")){
			elevStatus = elevMove(currentFloor);
			
		}
		else if (option.equalsIgnoreCase("down")){
			elevStatus = elevMove(currentFloor);
		}
			
		return elevStatus;
	}
	
	//method to change floor
	public String changeFloor(int floorno){
	    panel.setSelectedFloor(floorno);
		if ( getElevatorFloor() > panel.getSelectedFloor() ){
			elevStatus = "down";
		}
		else if ( getElevatorFloor() < panel.getSelectedFloor()){
			elevStatus = "up";
		}
				
		floor.setCurrentFloorNumber(panel.getSelectedFloor());
		
		floor.openFloorDoor(); // opening floor door 
		door.opendoor();        // opening elevator door 
		
		floor.closeFloorDoor();
		door.closedoor();
		
		return elevStatus;
	}
	
	
	
}
