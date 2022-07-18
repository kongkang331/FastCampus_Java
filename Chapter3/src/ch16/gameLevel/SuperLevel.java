package ch16.gameLevel;

public class SuperLevel extends PlayerLevel {
	
	@Override
	public String run() {
		return "엄청 빠르게 달립니다.";
	}
	
	@Override
	public String jump() {
		return "아주 높이 jump 합니다.";
	}
	
	@Override
	public String turn() {
		return "turn 합니다.";
	}
	
	@Override
	public String showLevelMessage() {
		return "****** 고급자 레벨입니다. ******";
	}
	
}
