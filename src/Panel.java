import java.util.Scanner;


public class Panel {

	Button buttons = new Button();
	Scanner scan = new Scanner(System.in);
	
	void display(){
		System.out.println("Select a Floor :");
		System.out.println("0 1 2 3 4 5 ");
		
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
