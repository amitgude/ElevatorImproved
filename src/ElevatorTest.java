import static org.junit.Assert.*;

import org.junit.Test;


public class ElevatorTest {

	Elevator e = new Elevator() ; 
	 
	//Floor f = new Floor(); 
	
	@Test
	public void testSetFloor() {
		e.setFloor(2) ; 
       assertEquals( 2, e.getElevatorFloor() );
	     
	}

	@Test
	public void testElevMove() {
		
			  assertEquals("up", e.elevMove(2));  ;
		    	 
		     
	  
	   
	}

	@Test
	public void testGetElevatorFloor() {
            e.elevMove(3) ;
            assertEquals(3, e.getElevatorFloor());  ;
		//fail("Not yet implemented");
	}

	@Test
	public void testCallElevator() {
		   assertEquals("up", e.elevMove(2));  ;
	}

	@Test
	public void testChangeFloor() {
		
	    e.elevMove(3) ;
        assertEquals(3, e.getElevatorFloor());  ;
	}

}
