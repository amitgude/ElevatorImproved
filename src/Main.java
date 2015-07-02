import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//current floor is floor of user 

    	Scanner scan = new Scanner(System.in);
	    String option  ; 
		int floorno ; 
		int currentFloor;
		Elevator elevator = new Elevator();
		
		String eleStatus;
		
		
		// scenario 1 
		currentFloor  =  3 ;
		System.out.println("You are currently on floor : " +currentFloor);
		
		

		System.out.println("Select an option");
		System.out.println(" Up ");
		System.out.println(" Down ");
		option = scan.next();
		
		

	
		
		eleStatus =elevator.callElevator(currentFloor , option );
		System.out.println("Lift is coming "+ eleStatus);
		
		
		

		System.out.println("Select a Floor :");
		System.out.println("0 1 2 3 4 5 ");	
		floorno = scan.nextInt();
		
		eleStatus =elevator.changeFloor(floorno);
		System.out.println("Lift is going-> "+ eleStatus);
		
		System.out.println("Now you are on floor : " +elevator.getElevatorFloor());

	}

}
