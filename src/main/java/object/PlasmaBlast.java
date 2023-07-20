package object;

import entity.Entity;
import entity.Projectile;
import game2d.GamePanel;

public class PlasmaBlast extends Projectile {
	
	GamePanel gp;
	
	public PlasmaBlast(GamePanel gp) {
		super(gp);

		this.gp = gp;
		name = "PlasmaBlast";
		speed = 10;
		maxHealth = 80;
		currentHealth = maxHealth;
		attack = 2;
		useCost = 1;
		alive = false;
		
		getImages();
	}

	public void getImages() {
		up1 = setupEntityImage("/projectiles/plasma_down_1.png", tileSize, tileSize);
		up2 = setupEntityImage("/projectiles/plasma_down_2.png", tileSize, tileSize);
		down1 = setupEntityImage("/projectiles/plasma_down_1.png", tileSize, tileSize);
		down2 = setupEntityImage("/projectiles/plasma_down_2.png", tileSize, tileSize);
		right1 = setupEntityImage("/projectiles/plasma_down_1.png", tileSize, tileSize);
		right2 = setupEntityImage("/projectiles/plasma_down_2.png", tileSize, tileSize);
		left1 = setupEntityImage("/projectiles/plasma_down_1.png", tileSize, tileSize);
		left2 = setupEntityImage("/projectiles/plasma_down_2.png", tileSize, tileSize);
	}
	
	public boolean hasResource(Entity user) {
		
		boolean returnVal = false;
		
		if (user.getCurrentMana() >= useCost) {
			returnVal = true;
		}
		
		return returnVal;
	}
	
	public void decreaseResource(Entity user) {
		
		user.decreaseMana(useCost);
	}
}
