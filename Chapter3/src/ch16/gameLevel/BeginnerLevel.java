package ch16.gameLevel;

public class BeginnerLevel extends PlayerLevel {
	
	@Override
	public String run() {
		return "천천히 달립니다.";
	}
	
	@Override
	public String jump() {
		return "jump 못하지롱";
	}
	
	@Override
	public String turn() {
		return "turn 못하지롱";
	}
	
	@Override
	public String showLevelMessage() {
		return "****** 초급자 레벨입니다. ******";
	}
	
}
