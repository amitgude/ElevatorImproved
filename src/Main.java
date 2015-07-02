
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//current floor is floor of user 
		int currentFloor;
		Elevator elevator = new Elevator();
		
		String eleStatus;
		// scenario 1 


		currentFloor  =  3 ;
		System.out.println("You are currently on floor : " +currentFloor);
		eleStatus =elevator.callElevator(currentFloor);
		System.out.println("Lift is going "+ eleStatus);
		eleStatus =elevator.changeFloor();
		System.out.println("Lift is going "+ eleStatus);
		System.out.println("Now you are on floor : " +elevator.getElevatorFloor());

//		// scenario 2 
//		currentFloor  =  3 ;
//		elevator.setFloor(10);
//		elevator.callElevator(currentFloor);
//		elevator.changeFloor();
//
//
//		// scenario 3
//
//		currentFloor  =  5 ;
//		elevator.setFloor(5);
//		elevator.callElevator(currentFloor);
//		elevator.changeFloor();
//
//
//		// scenario 4
//		currentFloor  =  5 ;
//		elevator.setFloor(0);
//		elevator.callElevator(currentFloor);
//		elevator.changeFloor();



	}

}
