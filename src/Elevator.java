
public class Elevator {

	Panel panel = new Panel();
	Door  door  = new Door();
	Floor floor = new Floor();
	
	
	
	//elevator movement
	
	public void elevMove(int currentFloor){
		if (floor.getCurrentFloorNumber() > currentFloor){
			System.out.println(" >>>>> Lift coming down");
		}
		else if (floor.getCurrentFloorNumber() < currentFloor){
			System.out.println(" >>>>> Lift coming up");
		}
		floor.setCurrentFloorNumber(currentFloor);
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
		
	}
	
	
	
}
