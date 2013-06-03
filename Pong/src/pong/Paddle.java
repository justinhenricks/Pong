package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	private final int HEIGHT = 90;
	private final int WIDTH = 25; 
	private int x;
	private int y;
	private int dy = 0;
	
	public Paddle(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void update(){
		y += dy;
	}
	
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
	
	public void setDy(int dy){
		this.dy = dy;
	}
	
	public int getY(){
		return y;
	}
	
	public int getHeight(){
		return HEIGHT;
	}
}
