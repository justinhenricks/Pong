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
	Paddle paddleRight;
	Ball ball;
	Boolean inGame = true;
	int timerId;
	
	public Board(){
		paddleLeft = new Paddle(30, 250);
		paddleRight = new Paddle(1145, 250);
		ball = new Ball();
		timer = new Timer(5, this);
		timer.start();
		
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	private void update(){
		ball.update();
		paddleLeft.update();
		paddleRight.update();
		if(ball.collision(paddleLeft)){
			ball.goRight();
		}
		else if(ball.collision(paddleRight)){
			ball.goLeft();
		}
		else if(ball.isLoss()){
			timer.stop();
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Pong.WIDTH, Pong.HEIGHT);
		ball.paint(g);
		paddleLeft.paint(g);
		paddleRight.paint(g);
	}
	
	public void actionPerformed(ActionEvent e){
		update();
		repaint();
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP){
			paddleLeft.setDy(-2);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			paddleLeft.setDy(2);
		}
		if(e.getKeyCode() == KeyEvent.VK_A){
			paddleRight.setDy(-2);
		}
		if(e.getKeyCode() == KeyEvent.VK_Z){
			paddleRight.setDy(2);
		}
	}
	
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN){
			paddleLeft.setDy(0);
		}
		if(e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_Z){
			paddleRight.setDy(0);
		}
	}
	
	public void keyTyped(KeyEvent e){
		
		
	}
}
