package builder2.vbbc.pe;
public class HouseClient {
	public static void main(String[] args) {
		HouseDirector director = new HouseDirector();
		WoodBuilder woodBuilder = new WoodBuilder();
		BrickBuilder brickBuilder = new BrickBuilder();
	
		// Build a wooden house
		House woodHouse = director.construcHouse(woodBuilder);
		System.out.println();
		// Build a brick house
	//	House brickHouse = director.construcHouse(brickBuilder);
	}
}
