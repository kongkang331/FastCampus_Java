package ch16.gameLevel;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel advaceLevel = new AdvancedLevel();
		player.upgradeLevel(advaceLevel);
		player.play(2);
		
		SuperLevel superLevel = new SuperLevel();
		player.upgradeLevel(superLevel);
		player.play(3);

	}

}
