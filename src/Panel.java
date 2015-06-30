import java.util.Scanner;


public class Panel {

	Buttons buttons = new Buttons();
	Scanner scan = new Scanner(System.in);
	
	void display(){
		System.out.println("Select a Floor :");
		System.out.println("0 1 2 3 4 5 ");
		System.out.println("6 7 8 9 10");
	}
	
	
	void panelDisplay(){
		System.out.println("Enter a floor number:");
		int option = scan.nextInt();
		buttons.click(option);
	}
}
