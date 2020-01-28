package textbook_questions;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JFrame implements MouseListener{

	private JPanel panel = new JPanel();
	private ArrayList<Rectangle> rects = new ArrayList<Rectangle>();
	private static int width = 50;
	private static int height = 50;
	
	
	public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		
			System.out.println(e.getX()+","+e.getY()); //Just to test it is working
			Rectangle temp = new Rectangle(e.getX() - width/2,e.getY() - height/2,width,height);
			rects.add(temp);
			System.out.println(rects);
			
			panel.getGraphics().drawRect(e.getX() - width/2, e.getY() - height/2, 50, 50);
			
			for (int i = 0; i < rects.size(); i = i + 1) {
				
				for (int j = 1; j < rects.size(); j = j + 1) {
				
					Rectangle irect = Rectangle.intersection(rects.get(i),rects.get(j));
					panel.getGraphics().fillRect(irect.getLeft(),irect.getBottom(), irect.getWidth(), irect.getHeight());
					
					
				}
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		

	public Display() {
		
		this.setTitle("Display");
		this.setSize(500,400);
		this.add(panel);
		panel.addMouseListener(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		
		Display d = new Display();
		
	}
}
