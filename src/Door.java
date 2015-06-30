
public class Door {
	
Boolean estatus;
	
	public Door() {
		
		this.estatus=false;
		// TODO Auto-generated constructor stub
	}
	
	
	public void opendoor(){
		
		this.estatus=true;
		System.out.println("Door Opening ...............");
	}
	
public void closedoor(){
		
		this.estatus=false;
		System.out.println("Door Closing ...............");
	}

}
