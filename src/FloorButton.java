import java.util.Scanner;


public class FloorButton {
	
	private String option;
	Scanner scan = new Scanner(System.in);
	
	void display(){
		System.out.println("Select an option");
		System.out.println(" Up ");
		System.out.println(" Down ");
	}
	
	void selectOption(){
		display();
		
		option = scan.next();
		
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
}
