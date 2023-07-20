package entity;

//import java.util.Random;

import game2d.GamePanel;

public class Patrick extends Entity {

	int tileSize;
	
	public Patrick(GamePanel gp) {
		super(gp);
		tileSize = gp.getTileSize();
		
		name = "Patrick";
		direction = "down";
		dialogIndex = 0;
		type = NPC;

		// Patrick does not move
		speed = 0;

		getPatrickImage();
		setDialog();
	}

	public void getPatrickImage() {
		
		down1 = setupEntityImage("/npc/patrick_down_1.png", tileSize, tileSize);
		down2 = setupEntityImage("/npc/patrick_down_2.png", tileSize, tileSize);
	}

	public void setDialog() {

		dialogs[0] = "We require knowledge.  Please help\nus by taking the Cassandra Survey.";
		dialogs[1] = "All that is visible must grow beyond\nitself, and extend into the realm\nof the invisible.";
		dialogs[2] = "You must go to San Jose, and seek\nout the Cassandra Summit.";
	}
	
	public void setAction() {
		actionLockCounter++;
		
		if (actionLockCounter >= 120) {
			
			direction = "down";
			actionLockCounter=0;
		}
	}
	
	public void speak() {
		super.speak();
	}
	
}
