package object;

import entity.Entity;
import game2d.GamePanel;

public class LaserDisc extends Entity {

	public LaserDisc(GamePanel gp) {
		super(gp);
		
		name = "Laser Disc";
		type = SWORD;
		description = "[" + name + "]\nA disc that reads\n'Memorex'.";
		down1 = setupEntityImage("/objects/laserdisc.png", tileSize, tileSize);
		attackArea.width = 36;
		attackArea.height = 36;
		attackValue = 2;
	}	
}
