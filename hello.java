import javax.swing.*;
public class hello extends JFrame{
	public static void main(String[] args){
		new hello();
	}
	public hello(){
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("Hello World, this is my first Java program on Ubuntu Linux!!");
		panel1.add(label1);
		this.add(panel1);
		this.setTitle("Hello World");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
