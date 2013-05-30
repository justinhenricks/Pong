package pong;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Paddle extends Sprite {
	/*String paddle = "../img/paddle.png";
	
	int dy;
	
	public Paddle() {
		ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(paddle));
		super.image = imageIcon.getImage();
		super.width = image.getWidth(null);
		super.height = image.getHeight(null);
		
		resetState();
	}
	
	public void move(){
		y += dy;
		if(y <= 2){
			y = 2;
		}
		if(y >= Commons.PADDLE_TOP){
			y = Commons.PADDLE_TOP;
		}
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_UP){
			dy = 2;
		}
		
		if(key == KeyEvent.VK_DOWN){
			dy = -2;
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_UP){
			dy = 0;
		}
		
		if(key == KeyEvent.VK_DOWN){
			dy = 0;
		}
	}
	
	public void resetState(){
		super.x = 200;
		super.y = 360;
	}*/
}
