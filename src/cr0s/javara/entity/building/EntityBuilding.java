package cr0s.javara.entity.building;

import org.newdawn.slick.Graphics;

import cr0s.javara.entity.Entity;
import cr0s.javara.gameplay.Player;
import cr0s.javara.gameplay.Team;

public class EntityBuilding extends Entity {
	public int tileX, tileY;
	
	public int hp, maxHp;
	
	public boolean isPrimary = false, isRepairing = false, isInvuln = false, isDestroyed = false;
	
	public int progressValue, maxProgress;
	public EntityBuilding(int tileX, int tileY, Team team, Player player, float sizeWidth, float sizeHeight) {
		super(tileX, tileY, team, player, sizeWidth, sizeHeight);
		
		this.tileX = tileX;
		this.tileY = tileY;
	}
	
	public void giveDamage(int amount) {
		if (!isInvuln) {
			hp -= amount;
			
			if (hp <= 0) {
				hp = 0;
				isDestroyed = true;
			}
		}
	}

	@Override
	public void updateEntity(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderEntity(Graphics g) {
	}

	@Override
	public boolean shouldRenderedInPass(int passNum) {
		return true;
	}
}
