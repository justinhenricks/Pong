package pong;

import javax.swing.JPanel;



import java.awt.Image;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Board extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	Image imageIcon;
	Timer timer;
	String message = "Game Over";
	Paddle paddle;
	Ball ball;
	Boolean inGame = true;
	int timerId;
	
	public Board(){
		paddle = new Paddle();
		ball = new Ball();
		timer = new Timer(50, this);
		timer.start();
	}
	
	private void update(){
		ball.update();
		paddle.update();
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1200, 600);
		ball.paint(g);
		paddle.paint(g);
	}
	
	public void actionPerformed(ActionEvent e){
		update();
		repaint();
	}
	
	
	
	
	
	
	
	
	
	
	/*
	public void addNotify(){
		super.addNotify();
		gameInit();
	}
	
	
	public void paint(Graphics g){
		super.paint(g);
		
		if(inGame){
			g.drawImage(paddle.getImage(), paddle.getX(), 
						paddle.getY(), paddle.getWidth(), 
						paddle.getHeight(), this);
		}
		else{
			Font font = new Font("Verdana", Font.BOLD, 18);
            FontMetrics metr = this.getFontMetrics(font);

            g.setColor(Color.BLACK);
            g.setFont(font);
            g.drawString(message,
                         (Commons.WIDTH - metr.stringWidth(message)) / 2,
                         Commons.WIDTH / 2);
		}
	}
	
	private class TAdapter extends KeyAdapter {
		public void KeyPressed(KeyEvent e){
			paddle.keyPressed(e);
		}
		
		public void KeyReleased(KeyEvent e){
			paddle.keyReleased(e);
		}
	}
	
	class ScheduleTask extends TimerTask{
		
		public void run() {
			paddle.move();
			repaint();
		}
	}
*/
}
