package practice.com.xworkz.practice.constants;

public enum AllDataTypes {

	VALUE1("R225", "RED"), VALUE2("R215", "BLACK"), VALUE3("R180", "RED");

	public String tyreSize;
	public String colour;

	private AllDataTypes(String tyreSize, String colour) {
		this.tyreSize = tyreSize;
		this.colour = colour;

	}

}
