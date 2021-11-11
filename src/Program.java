import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {
		Driver tom = new Driver();
		tom.name = "Tom";
		tom.age = 22;
		tom.category = 'B';
		
		Car infinity = new Car();
		infinity.brand = "Infinity";
		infinity.color = "Black";
		
		Fine fine = new Fine();
		String oplata = fine.IsItFine(120, 125);
		
		String text = "Driver's name: " + tom.name;
		text = text + "\n" + "Age: " + tom.age;
		text = text + "\n" + "Category: " + tom.category;
		text = text + "\n\n" + "Car Brand: " + infinity.brand;
		text = text + "\n" + "Color of the Car: " + infinity.color;
		text = text + "\n\n" + oplata;
		
		int type = JOptionPane.INFORMATION_MESSAGE;
		String title = "Police Verdict";
		JOptionPane.showMessageDialog(null, text, title, type);
	}

}
