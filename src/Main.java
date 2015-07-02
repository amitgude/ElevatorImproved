
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cuurrent floor is floor of user 
		int currentFloor;
		Elevator elevator = new Elevator();

		// scenario 1 
		currentFloor  =  3 ; 
		elevator.callElevator(currentFloor);
		elevator.changeFloor();


		// scenario 2 
		currentFloor  =  3 ;
		elevator.setFloor(10);
		elevator.callElevator(currentFloor);
		elevator.changeFloor();


		// scenario 3

		currentFloor  =  5 ;
		elevator.setFloor(5);
		elevator.callElevator(currentFloor);
		elevator.changeFloor();


		// scenario 4
		currentFloor  =  5 ;
		elevator.setFloor(0);
		elevator.callElevator(currentFloor);
		elevator.changeFloor();



	}

}
