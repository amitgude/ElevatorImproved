
public class Door {
	
Boolean estatus;
	
	public Door() {
		
		this.estatus=false;
		// TODO Auto-generated constructor stub
	}
	
	
	public void opendoor(){
		
		this.estatus=true;
		System.out.println("elevator Door Opening");
	}
	
	public void openFloordoor(){
		
		this.estatus=true;
		System.out.println("Floor Door Opening ");
	}
	
	
public void closeFloordoor(){
		
		this.estatus=false;
		System.out.println("Floor Door Closing ");
	}
	
public void closedoor(){
		
		this.estatus=false;
		System.out.println(" elevator Door Closing");
	}

}
