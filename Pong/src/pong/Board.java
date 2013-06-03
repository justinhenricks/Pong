package pong;

import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Board extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	Image imageIcon;
	Timer timer;
	String message = "Game Over";
	Paddle paddleLeft;
	Ball ball;
	Boolean inGame = true;
	int timerId;
	
	public Board(){
		paddleLeft = new Paddle(25, 30);
		ball = new Ball();
		timer = new Timer(30, this);
		timer.start();
		
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	private void update(){
		ball.update();
		paddleLeft.update();
		if(ball.collision(paddleLeft)){
			ball.goRight();
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Pong.WIDTH, Pong.HEIGHT);
		ball.paint(g);
		paddleLeft.paint(g);
	}
	
	public void actionPerformed(ActionEvent e){
		update();
		repaint();
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP && !(paddleLeft.getY() <= 0)){
			paddleLeft.setDy(-7);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN && 
		!(paddleLeft.getY() + paddleLeft.getHeight() >= 600)){
			paddleLeft.setDy(7);
		}
	}
	
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN){
			paddleLeft.setDy(0);
		}	
	}
	
	public void keyTyped(KeyEvent e){
		
		
	}
}
