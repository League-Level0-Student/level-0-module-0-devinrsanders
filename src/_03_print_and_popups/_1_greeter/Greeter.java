package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("I'm a \"programmer\":\\\n");
		System.out.println("I'm on my own line");
		
		String 
		

		String input = JOptionPane.showInputDialog("What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hello "+input);
	}

}
