package pong;
import java.awt.Graphics;
import java.awt.Color;

public class Ball {
	private final int SIZE = 40;
	private int x = 600; 
	private int y = 300;
	private int dx = -5;
	private int dy = -5;
	
	public Ball(){
		
	}
	
	public void update(){
		x += dx;
		y += dy;
		
		if(x <= 0){
			dx = 5;
		}
		else if(x + SIZE >= 1200){
			dx = -1;
		}
		else if(y <= 0){
			dy = 5;
		}
		else if(y + SIZE + 20 >= 600){
			dy = -5;
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillOval(x, y, SIZE, SIZE);
	}
}
