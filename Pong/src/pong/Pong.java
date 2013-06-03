package pong;

import javax.swing.JFrame;

public class Pong extends JFrame {
	
	private static final long serialVersionUID = 1L;
	protected static final int WIDTH = 1200, HEIGHT = 600;
	
	public Pong(){
		add(new Board());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setTitle("Pong Game");
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Pong();
	}
}
