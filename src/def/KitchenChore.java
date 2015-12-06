package def;

public class KitchenChore extends Chore {
	public String getDescription() {
		return "Kitchen chore.\n" + description;
	}
	public static String getType() {
		return "Kitchen Chore";
	}
}
