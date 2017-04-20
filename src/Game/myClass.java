package Game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class myClass extends JPanel { 
	public myClass() {
		super();
		// New colors - pass RGBA 0-255
		//Color myColor = new Color(255, 255, 255, 100);
		setBackground(Color.BLACK);
	
}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(4.0f,
				BasicStroke.CAP_ROUND,
				BasicStroke.JOIN_ROUND));
		g2.setColor(Color.WHITE);
		g2.drawLine(0, 0,1000, 1000);
		g2.setColor(Color.YELLOW);
		g2.fillRect(0, 0, 1000, 1000);
		for(int x = 0; x < 1920 ; x+=25){
			
			
		g2.setColor(Color.blue);
		g2.fillRect(0, 0, 900, 200);
		g2.drawLine(x,0,1680,1080);
		
		
		}
}
	public void setupDisplay() {
		JFrame application = new JFrame();
		application.add(this);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(1920, 1080);
		application.setExtendedState(JFrame.MAXIMIZED_BOTH);
		application.setUndecorated(true);
		application.setVisible(true);
		
		
		Dimension d = application.getSize();
		System.out.println(d.getWidth() + ", " + d.getHeight());
		
		
	}
	
	public static void main(String[] args) {
		myClass program = new myClass();
		program.setupDisplay();
		
		program.repaint();
	}
	
	

}