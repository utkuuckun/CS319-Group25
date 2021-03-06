import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Menu extends JPanel {

	private BufferedImage nonRoad;
	private BufferedImage road;
	
	//temporary variable
	private static int theme = 1;

	protected Menu() {
		
		this.setLayout(null);
		
		try {
			if (theme == 0) {
				road = ImageIO.read(getClass().getResourceAsStream("/road.png"));
				nonRoad = ImageIO.read(getClass().getResourceAsStream("/grass.png"));
			}
			
			if (theme == 1) {
				road = ImageIO.read(getClass().getResourceAsStream("/roadDesert.png"));
				nonRoad = ImageIO.read(getClass().getResourceAsStream("/desert.png"));
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		repaint();
	}
	
	public void paint(Graphics g){
		
		try {
			if (theme == 0) {
				road = ImageIO.read(getClass().getResourceAsStream("/road.png"));
				nonRoad = ImageIO.read(getClass().getResourceAsStream("/grass.png"));
			}
			
			if (theme == 1) {
				road = ImageIO.read(getClass().getResourceAsStream("/roadDesert.png"));
				nonRoad = ImageIO.read(getClass().getResourceAsStream("/desert.png"));
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 14; i++) {
			g.drawImage(nonRoad, i * 100, 0, 100, 90, null);
			g.drawImage(road, i * 100, 90, 100, 90, null);
			g.drawImage(road, i * 100, 180, 100, 90, null);
			g.drawImage(road, i * 100, 270, 100, 90, null);
			g.drawImage(nonRoad, i * 100, 360, 100, 90, null);
			g.drawImage(road, i * 100, 450, 100, 90, null);
			g.drawImage(nonRoad, i * 100, 540, 100, 90, null);
			g.drawImage(road, i * 100, 630, 100, 90, null);
			g.drawImage(road, i * 100, 720, 100, 90, null);
			g.drawImage(nonRoad, i * 100, 810, 100, 90, null);
		}

	}
	
	public int getTheme() {
		return theme;
	}

	public void setTheme(int theme) {
		this.theme = theme;
	}
	
	
}
