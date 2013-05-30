package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	private final int HEIGHT = 80;
	private final int WIDTH = 35;
	private int x = 10; 
	private int y = 300;
	private int dx = -5;
	private int dy = -5;
	
	public Paddle(){
		
	}
	
	public void update(){
		y += dy;
		
		if(x <= 0){
			dx = 5;
		}
		else if(x + HEIGHT >= 1200){
			dx = -1;
		}
		else if(y <= 0){
			dy = 5;
		}
		else if(y + HEIGHT + 20 >= 600){
			dy = -5;
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
}
