package Lab2;
import javax.swing.JOptionPane;
public class task1 {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("What is your name?");
		String age=JOptionPane.showInputDialog("What is your age?");
		String hobby=JOptionPane.showInputDialog("What is your favourite hobby?");
		String movie=JOptionPane.showInputDialog("What is your favourite movie?");
		String color=JOptionPane.showInputDialog("What is your favourite color?");
		String place=JOptionPane.showInputDialog("What is your favourite place to visit?");


		String message="My name is "+name+". I am "+age+" years old. My favourite hobby is "+hobby+" and my favourite movie is "+movie+". I love the color "+color+" and I love visiting "+place+".";
		
		JOptionPane.showMessageDialog(null, message);

	}

}
