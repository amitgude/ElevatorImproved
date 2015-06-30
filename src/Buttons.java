
public class Buttons {

	private Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	void click(Integer option){
		setValue(option);
	}
	
}
