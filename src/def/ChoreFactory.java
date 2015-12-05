package def;

public class ChoreFactory {

	public Chore getChore(String choreType) {
		if (choreType == null) {
			return null;
		}
		else if (choreType.equalsIgnoreCase("kitchen")) {
			return new KitchenChore();
		}
		else if (choreType.equalsIgnoreCase("yard")) {
			return new YardChore();
		}
		else if (choreType.equalsIgnoreCase("bathroom")) {
			return new BathroomChore();
		}
		else {
			return new Chore();
		}
		
	}
}
