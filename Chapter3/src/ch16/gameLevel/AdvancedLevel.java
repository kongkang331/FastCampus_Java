package ch16.gameLevel;

public class AdvancedLevel extends PlayerLevel {
	
	@Override
	public String run() {
		return "빨리 달립니다.";
	}
	
	@Override
	public String jump() {
		return "높이 jump 합니다.";
	}
	
	@Override
	public String turn() {
		return "turn 못하지롱";
	}
	
	@Override
	public String showLevelMessage() {
		return "****** 중급자 레벨입니다. ******";
	}
	
}
