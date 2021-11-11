
public class Fine {
	public String IsItFine(int x, int y) {
		String result = "";
		if (x<y) {
			result = "You must pay a fine";
		}
		else {
			result = "It's okay. You can go";
		}
		return result;
	}
}
