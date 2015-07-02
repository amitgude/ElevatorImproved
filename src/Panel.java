import java.util.Scanner;


public class Panel {

	Buttons buttons = new Buttons();
	Scanner scan = new Scanner(System.in);
	
	void display(){
		
		
	}
	
	
	void Click(){
		display();
		System.out.println("Enter a floor number:");
		int option = scan.nextInt();
		buttons.click(option);
	}
	
	public int getSelectedFloor(){
		return buttons.getValue();
	}
}
