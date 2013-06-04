package pong;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import java.awt.Color;

public class Ball {
	Random random = new Random();
	private final int SIZE = 30;
	private final int X_SPEED = 1 + random.nextInt(2);
	private final int Y_SPEED = 1 + random.nextInt(2);
	private int x = Pong.WIDTH / 2; 
	private int y = Pong.HEIGHT / 2;
	private int dx = X_SPEED;
	private int dy = Y_SPEED;
	boolean lose = false;
	
	public Ball(){
		
	}
	
	public void update(){
		x += dx;
		y += dy;
		
		if(x <= 0){
			lose = true;
		}
		else if(x + SIZE >= Pong.WIDTH){
			lose = true;
		}
		else if(y <= 0){
			goDown();
		}
		else if(y + SIZE + 20 >= Pong.HEIGHT){
			goUp();
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillOval(x, y, SIZE, SIZE);
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x, y, SIZE, SIZE);
	}
	
	public boolean collision(Paddle p){
		Rectangle ball = getBounds();
		Rectangle paddle = p.getBounds();
		
		return ball.intersects(paddle);
	}
	
	public void goRight(){
		dx = X_SPEED;
	}
	
	public void goLeft(){
		dx = -X_SPEED;
	}
	
	public void goDown(){
		dy = Y_SPEED;
	}
	
	public void goUp(){
		dy = -Y_SPEED;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Boolean isLoss(){
		return lose;
	}
}
