package def;

public class YardChore extends Chore {
	public String getDescription() {
		return "Yard chore.\n" + description;
	}
	public static String getType() {
		return "Yard Chore";
	}
}
