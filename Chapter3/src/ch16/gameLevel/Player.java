package ch16.gameLevel;

public class Player {

	public PlayerLevel level;
	
	public PlayerLevel getLevel() {
		
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play() {
		
	}
	
}
