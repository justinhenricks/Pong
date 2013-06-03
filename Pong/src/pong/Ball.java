package pong;
import java.awt.Graphics;
import java.awt.Color;

public class Ball {
	private final int SIZE = 30;
	private final int X_SPEED = -8;
	private final int Y_SPEED = -8;
	private int x = Pong.WIDTH / 2; 
	private int y = Pong.HEIGHT / 2;
	private int dx = X_SPEED;
	private int dy = Y_SPEED;
	
	public Ball(){
		
	}
	
	public void update(){
		x += dx;
		y += dy;
		
		if(x <= 0){
			dx = 8;
		}
		else if(x + SIZE >= Pong.WIDTH){
			dx = -8;
		}
		else if(y <= 0){
			dy = 8;
		}
		else if(y + SIZE + 20 >= Pong.HEIGHT){
			dy = -8;
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillOval(x, y, SIZE, SIZE);
	}
	
	public boolean collision(){
		
	}
}
